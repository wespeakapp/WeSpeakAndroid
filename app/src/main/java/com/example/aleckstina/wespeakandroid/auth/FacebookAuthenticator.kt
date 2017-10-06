package com.example.aleckstina.wespeakandroid.auth

import android.app.Activity
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginResult
import com.example.aleckstina.wespeakandroid.auth.Authenticator
import com.facebook.login.LoginManager
import java.util.*

/**
 * Created by aleckstina on 10/6/17.
 */
class FacebookAuthenticator : Authenticator, FacebookCallback<LoginResult> {
    private lateinit var callbackManager : CallbackManager

    override fun doLogin(activity: Activity) {
        callbackManager = CallbackManager.Factory.create()
        LoginManager.getInstance().registerCallback(callbackManager, this)
        LoginManager.getInstance().logInWithReadPermissions(activity, getScope())
    }

    override fun onSuccess(result: LoginResult) {
        System.out.println(result.accessToken);
    }

    override fun onCancel() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(error: FacebookException?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    private fun getScope() = Arrays.asList("public_profile", "email")
}