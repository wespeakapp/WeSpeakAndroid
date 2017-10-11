package com.example.aleckstina.wespeakandroid.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import com.example.aleckstina.wespeakandroid.R
import com.example.aleckstina.wespeakandroid.auth.Authenticator

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
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        facebookAuthenticator.handleActivityResult(requestCode, resultCode, data)
        if(facebookAuthenticator.isFinished()) {
            changeActivityAfterResult()
        }
    }

    private fun changeActivityAfterResult() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
