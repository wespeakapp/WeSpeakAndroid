package com.example.aleckstina.wespeakandroid.auth

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageInstaller
import android.util.Log
import android.widget.Toast
import com.facebook.login.LoginResult
import com.example.aleckstina.wespeakandroid.auth.Authenticator
import com.facebook.*
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
        System.out.println(AccessToken.getCurrentAccessToken());
    }

    override fun onSuccess(result: LoginResult) {
        System.out.println(result.accessToken);
    }

    override fun onCancel() {

        System.out.println("THE NEEGA")
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(error: FacebookException?) {

        System.out.println("THE ERROR")
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    private fun getScope() = Arrays.asList("public_profile", "email")

    override fun handleActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK) {
            callbackManager.onActivityResult(requestCode, resultCode, data)
        }
    }

}