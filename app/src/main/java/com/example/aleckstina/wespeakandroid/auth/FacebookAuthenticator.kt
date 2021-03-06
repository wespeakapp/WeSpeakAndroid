package com.example.aleckstina.wespeakandroid.auth

import android.app.Activity
import android.content.Intent
import com.facebook.login.LoginResult
import com.facebook.*
import com.facebook.login.LoginManager
import java.util.*

/**
 * Created by aleckstina on 10/6/17.
 */
class FacebookAuthenticator : Authenticator, FacebookCallback<LoginResult> {
  private lateinit var callbackManager: CallbackManager
  private var isFinished: Boolean = false

  override fun doLogin(activity: Activity) {
    callbackManager = CallbackManager.Factory.create()
    LoginManager.getInstance().registerCallback(callbackManager, this)
    LoginManager.getInstance().logInWithReadPermissions(activity, getScope())
  }

  override fun onSuccess(result: LoginResult) {
  }

  override fun onCancel() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun onError(error: FacebookException?) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  private fun getScope() = Arrays.asList("public_profile", "email")

  override fun handleActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    if (resultCode == Activity.RESULT_OK) {
      callbackManager.onActivityResult(requestCode, resultCode, data)

      isFinished = true
    }
  }

  override fun isFinished(): Boolean = isFinished

}