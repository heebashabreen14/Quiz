package com.example.quizapp.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.quizapp.R
import com.example.quizapp.showFragmentBasedOnState

class QuizFragment: Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE) ?: return
        val ShouldShowLoginScreen: Boolean = sharedPref.getBoolean("LOGIN_BOOLEAN_KEY", true)


        if (ShouldShowLoginScreen) {
            showFragmentBasedOnState(LoginFragment(), requireActivity().supportFragmentManager)
            //ShouldShowLoginScreen = false

        } else {
            //showFragmentBasedOnState(QuizFragment(), requireActivity().supportFragmentManager)
            //ShouldShowLoginScreen = true
        }
        Log.e("QuizFrragment", "OnCreate, state is $ShouldShowLoginScreen")

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}
