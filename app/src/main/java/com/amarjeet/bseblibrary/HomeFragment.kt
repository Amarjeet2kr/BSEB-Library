package com.amarjeet.bseblibrary

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.amarjeet.bseblibrary.databinding.FragmentHomeBinding
import com.amarjeet.bseblibrary.englishmedium.EnglishMediumBooksActivity
import com.amarjeet.bseblibrary.englishmedium.EnglishMediumQuestionPaperActivity
import com.amarjeet.bseblibrary.englishmedium.EnglishMediumVideoActivity
import com.amarjeet.bseblibrary.hindimedium.HindiMediumBooksActivity
import com.amarjeet.bseblibrary.hindimedium.HindiMediumVideoActivity
import com.amarjeet.bseblibrary.hindimedium.HindiMediumQuestionPaperActivity
import com.amarjeet.bseblibrary.urdumedium.UrduMediumBooksActivity
import com.amarjeet.bseblibrary.urdumedium.UrduMediumQuestionPaperActivity
import com.amarjeet.bseblibrary.urdumedium.UrduMediumVideoActivity

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binder = FragmentHomeBinding.inflate(layoutInflater)
        /********************************************************************************************
         *                          Hindi Medium
         *******************************************************************************************/
        //to open the hindi books activity
        binder.btnHindiBooks.setOnClickListener{
            val intent = Intent(this@HomeFragment.requireContext(), HindiMediumBooksActivity::class.java)
            startActivity(intent)
        }

        //to open the hindi medium video activity
        binder.btnHindiMediumVideo.setOnClickListener{
            val intent = Intent(this@HomeFragment.requireContext(), HindiMediumVideoActivity::class.java)
            startActivity(intent)
        }

        //to open the Question paper activity
        binder.btnHindiMediumQuestionPaper.setOnClickListener{
            val intent = Intent(this@HomeFragment.requireContext(), HindiMediumQuestionPaperActivity::class.java)
            startActivity(intent)
        }




        /********************************************************************************************
         *                          English Medium
         *******************************************************************************************/
        //to open the english books activity
        binder.btnEnglishMediumBook.setOnClickListener{
            val intent = Intent(this@HomeFragment.requireContext(), EnglishMediumBooksActivity::class.java)
            startActivity(intent)
        }

        //to open the english medium video activity
        binder.btnEnglishMediumVideos.setOnClickListener{
            val intent = Intent(this@HomeFragment.requireContext(), EnglishMediumVideoActivity::class.java)
            startActivity(intent)
        }

        //to open the Question paper activity
        binder.btnEnglishMediumQuestionPaper.setOnClickListener{
            val intent = Intent(this@HomeFragment.requireContext(), EnglishMediumQuestionPaperActivity::class.java)
            startActivity(intent)
        }




        /********************************************************************************************
         *                          Urdu Medium
         *******************************************************************************************/
        //to open the english books activity
        binder.btnUrduMediumBook.setOnClickListener{
            val intent = Intent(this@HomeFragment.requireContext(), UrduMediumBooksActivity::class.java)
            startActivity(intent)
        }

        //to open the english medium video activity
        binder.btnUrduMediumVideos.setOnClickListener{
            val intent = Intent(this@HomeFragment.requireContext(), UrduMediumVideoActivity::class.java)
            startActivity(intent)
        }

        //to open the Question paper activity
        binder.btnUrduMediumQuestionPaper.setOnClickListener{
            val intent = Intent(this@HomeFragment.requireContext(), UrduMediumQuestionPaperActivity::class.java)
            startActivity(intent)
        }



        return binder.root
    }
}