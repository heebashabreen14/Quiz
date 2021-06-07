package com.example.quizapp

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.example.quizapp.fragment.LoginFragment
import com.example.quizapp.fragment.QuizFragment


//var ShouldShowLoginScreen: Boolean = true
fun saveKeyPreferences(context: Context){
    with(
        context.getSharedPreferences(
            "Login_Preference_Key",
            Context.MODE_PRIVATE
        ).edit()
    ){
        putBoolean("Login_key", true)
        commit()

    }
}
fun changeKeyPreferences(context: Context){
    with(
        context.getSharedPreferences(
            "Login_Preference_Key",
            Context.MODE_PRIVATE
        ).edit()
    ){
        putBoolean("Login_key", false)
        commit()

    }
}
fun loginPreferences(
    context: FragmentActivity
){
    val sharedPref = context.getSharedPreferences(
        "Login_Preference_Key",
        Context.MODE_PRIVATE

    )
    with(
        sharedPref.getBoolean(
            "Login_Key",
            false

        )
    ){
        if(!this){
            showFragmentBasedOnState(LoginFragment(), context.supportFragmentManager)

        }

    }
}
