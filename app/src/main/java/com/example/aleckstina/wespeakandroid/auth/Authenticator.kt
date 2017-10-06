package com.example.aleckstina.wespeakandroid.auth

import android.app.Activity

/**
 * Created by aleckstina on 10/6/17.
 */
interface Authenticator {
    companion object {
        const val FACEBOOK = "facebook"
        fun create(type: String) = when(type) {
            FACEBOOK -> FacebookAuthenticator()
            else -> throw IllegalArgumentException("Undefined Type")
        }
    }

    fun doLogin(activity: Activity)
}