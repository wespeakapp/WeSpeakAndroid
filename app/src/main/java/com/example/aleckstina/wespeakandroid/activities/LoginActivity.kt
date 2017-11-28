package com.example.aleckstina.wespeakandroid.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import com.example.aleckstina.wespeakandroid.R
import com.example.aleckstina.wespeakandroid.auth.Authenticator
import com.example.aleckstina.wespeakandroid.http.ApiClient
import com.example.aleckstina.wespeakandroid.http.ApiInterface
import com.example.aleckstina.wespeakandroid.model.AccessTokenModel
import com.example.aleckstina.wespeakandroid.model.User
import com.facebook.AccessToken
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity :  AppCompatActivity() {
  private lateinit var mFacebookLogin : Button
  private val facebookAuthenticator by lazy {
    Authenticator.create(Authenticator.FACEBOOK)
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
      _ -> facebookAuthenticator.doLogin(this)
    }
  }

  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)
    facebookAuthenticator.handleActivityResult(requestCode, resultCode, data)
    if(facebookAuthenticator.isFinished()) {
      val mApiService = ApiClient
        .getInstance()
        .getApiService()
      val call : Call<AccessTokenModel> = mApiService.getGeneratedAccessToken(AccessToken.getCurrentAccessToken().token)

      call.enqueue(object: Callback<AccessTokenModel> {
        override fun onResponse(call: Call<AccessTokenModel>?, response: Response<AccessTokenModel>?) {
          System.out.println(response?.body()?.getAccessToken())
        }

        override fun onFailure(call: Call<AccessTokenModel>?, t: Throwable?) {
        }

      })
    }
  }

  private fun changeActivityAfterResult() {
    val intent = Intent(this, MainActivity::class.java)
    startActivity(intent)
  }
}
