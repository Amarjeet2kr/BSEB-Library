@file:Suppress("DEPRECATION")

package com.amarjeet.bseblibrary

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Base64.encodeToString
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.facebook.AccessToken
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FacebookAuthProvider
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.CoroutineStart
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.*


class SignInActivity : AppCompatActivity() {

    //Google authentication variable
    private lateinit var mAuth: FirebaseAuth
    private lateinit var googleSignInClient: GoogleSignInClient
    companion object {
        private const val RC_SIGN_IN = 120
    }

    //facebook authentication variable
    // Initialize Facebook Login button
    private var callbackManager = CallbackManager.Factory.create()
    private lateinit var buttonFacebookLogin: Button
    private var fAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)




        // Configure Google Sign In
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken("576505960238-7jthsmh2t4qdm6p7390bf38f2scfbj3k.apps.googleusercontent.com")
            .requestEmail()
            .build()
        googleSignInClient = GoogleSignIn.getClient(this, gso)

        //Firebase Auth instance
        mAuth = FirebaseAuth.getInstance()

        //Continue with google button
        val googleLoginbtn = findViewById<Button>(R.id.google_btn)
        googleLoginbtn.setOnClickListener {
            googleSignIn()
        }
        //Ends google sign-in



        //Begin Continue with Facebook account
        buttonFacebookLogin  = findViewById(R.id.facebook_btn)

        buttonFacebookLogin.setOnClickListener{
            fAuth = Firebase.auth
            if(userLoggedIn()) {
                val user = fAuth.currentUser
                updateUI(user)
            } else {
                LoginManager.getInstance().logInWithReadPermissions(this, listOf("email", "public_profile"))
                LoginManager.getInstance().registerCallback(callbackManager, object: FacebookCallback<LoginResult> {
                    override fun onSuccess(result: LoginResult) {
                        Log.e("TAG", "facebook:onSuccess:$result")
                        handleFacebookAccessToken(result.accessToken)
                    }

                    override fun onCancel() {
                        Log.e("TAG", "facebook:onCancel")
                        // ...
                    }

                    override fun onError(error: FacebookException) {
                        Log.e("TAG", "facebook:onError", error)
                        // ...
                    }
                })
            }
        }
        //End of Sign-in with facebook account


    }

    //facebook to check user is logged in or not
    private fun userLoggedIn(): Boolean {
        if(fAuth.currentUser != null && AccessToken.getCurrentAccessToken()!!.isExpired){
            return true
        }
        return false
    }

    //facebook
    private fun handleFacebookAccessToken(token: AccessToken) {
        Log.d("TAG", "handleFacebookAccessToken:$token")

        val credential = FacebookAuthProvider.getCredential(token.token)
        fAuth.signInWithCredential(credential)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("TAG", "signInWithCredential:success")
                    val user = fAuth.currentUser
                    updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("TAG", "signInWithCredential:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                    //updateUI(null)
                }
            }
    }

    private fun updateUI(user: FirebaseUser?) {
        val intent = Intent(this, DashboardActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun googleSignIn() {
        googleSignInClient.signOut()
        val signInIntent = googleSignInClient.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }

    //common for both google and facebook
    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        //Log.e("data", "result=" +data.toString())
        super.onActivityResult(requestCode, resultCode, data)

        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            val exception = task.exception
            if (task.isSuccessful) {
                try {
                    // Google Sign In was successful, authenticate with Firebase
                    val account = task.getResult(ApiException::class.java)!!
                    Log.d("SignInActivity", "firebaseAuthWithGoogle:" + account.id)
                    firebaseAuthWithGoogle(account.idToken!!)
                } catch (e: ApiException) {
                    // Google Sign In failed, update UI appropriately
                    Log.w("SignInActivity", "Google sign in failed", e)
                }
            } else {
                Log.w("SignInActivity", exception.toString())
            }
        }
        else {
            // Pass the activity result back to the Facebook SDK
            callbackManager.onActivityResult(requestCode, resultCode, data)

        }
    }

    private fun firebaseAuthWithGoogle(idToken: String) {
        val credential = GoogleAuthProvider.getCredential(idToken, null)
        mAuth.signInWithCredential(credential)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(
                        this@SignInActivity,
                        "Login Successful",
                        Toast.LENGTH_SHORT
                    ).show()
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("SignInActivity", "signInWithCredential:success")
                    @Suppress("DEPRECATION") val user = mAuth.currentUser
//                    Log.w("DisplayName", user!!.displayName!!)
//                    Log.w("ProviderId", user!!.providerId)
//                    Log.w("Profile_url", user!!.photoUrl.toString())
//                    Log.w("Email", user!!.email!!)
//                    Log.w("UId", user!!.uid)
                    val intent = Intent(this, DashboardActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    // If sign in fails, display a message to the user.
                    Log.d("SignInActivity", "signInWithCredential:failure")
                }
            }
    }

}