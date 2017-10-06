package com.example.aleckstina.wespeakandroid.activities

import android.app.Activity
import android.content.Intent
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button

import com.example.aleckstina.wespeakandroid.R
import com.example.aleckstina.wespeakandroid.auth.Authenticator
import com.example.aleckstina.wespeakandroid.auth.FacebookAuthenticator
import com.facebook.*
import com.facebook.login.LoginResult
import com.facebook.login.widget.LoginButton

class LoginActivity :  AppCompatActivity() {
    private lateinit var mFacebookLogin : Button
    private val facebookAuthenticator by lazy {
        Authenticator.create(Authenticator.FACEBOOK);
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mFacebookLogin = findViewById(R.id.facebookLoginButton)
        setOnClickFacebookButton()
        supportActionBar!!.hide()
    }
    private fun setOnClickFacebookButton() {
        mFacebookLogin.setOnClickListener() {
            v -> facebookAuthenticator.doLogin(this)
        }

        System.out.println(AccessToken.getCurrentAccessToken().token);

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        facebookAuthenticator.handleActivityResult(requestCode, resultCode, data)
    }
}
