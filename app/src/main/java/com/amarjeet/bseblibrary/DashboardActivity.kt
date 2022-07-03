package com.amarjeet.bseblibrary

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.amarjeet.bseblibrary.databinding.ActivityDashboardBinding
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth
import de.hdodenhof.circleimageview.CircleImageView
import java.util.*

class DashboardActivity : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth

    private lateinit var toggle: ActionBarDrawerToggle


    private lateinit var profileImage: String
    private lateinit var name: String
    private lateinit var email: String

    private lateinit var sProfileImage: CircleImageView
    private lateinit var sName: TextView
    private lateinit var sEmail: TextView


    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        //Binding
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //end


        //Write your code here
        mAuth = FirebaseAuth.getInstance()

        //display profile information such as profile_image, name, email account
        val user = mAuth.currentUser
        profileImage = user?.photoUrl.toString()
        name = user?.displayName.toString()
        email = user?.email.toString()

        Log.e("DisplayName", name)
        Log.e("Profile_url", profileImage)
        Log.e("Email", email)


//        sName = findViewById(R.id.user_name)
//        sName.text = name



        //toggle button
        val toolbar = findViewById<MaterialToolbar>(R.id.topAppBar)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.nav_view)


        toolbar.setNavigationOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        replaceFragment(HomeFragment())

        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
//                    Toast.makeText(applicationContext,"Clicked Home", Toast.LENGTH_SHORT).show()
                    replaceFragment(HomeFragment())
                    drawerLayout.closeDrawer(GravityCompat.START)
                }

                R.id.nav_contributors -> {
//                    Toast.makeText(applicationContext,"Clicked Contribution", Toast.LENGTH_SHORT).show()
                    replaceFragment(ContributorsFragment())
                    drawerLayout.closeDrawer(GravityCompat.START)
                }

                R.id.nav_share_app -> Toast.makeText(
                    applicationContext,
                    "Clicked App Share",
                    Toast.LENGTH_SHORT
                ).show()

                R.id.nav_rate_us -> Toast.makeText(
                    applicationContext,
                    "Clicked Rate Us",
                    Toast.LENGTH_SHORT
                ).show()

//                R.id.nav_feedback -> Toast.makeText(applicationContext,"Clicked Send Feedback", Toast.LENGTH_SHORT).show()

                R.id.about_us -> {
//                    Toast.makeText(applicationContext,"Clicked About Us", Toast.LENGTH_SHORT).show()
                    replaceFragment(AboutUsFragment())
                    drawerLayout.closeDrawer(GravityCompat.START)
                }

                R.id.log_out -> {
                    Toast.makeText(applicationContext, "Clicked Logout", Toast.LENGTH_SHORT).show()
                    FirebaseAuth.getInstance().signOut()
                    val intent = Intent(this, SignInActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView, fragment)
        fragmentTransaction.commit()
    }
}