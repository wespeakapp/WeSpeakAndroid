package com.example.aleckstina.wespeakandroid.session

import android.content.SharedPreferences
import android.content.Context
import javax.inject.Singleton


/**
 * Created by aleckstina on 11/15/17.
 */
@Singleton
class SessionManagement(context: Context) : SessionInterface {
  private var mContext : Context = context
  private lateinit var mSharedPreferences : SharedPreferences
  companion object {

  }
  override fun setAccessToken(accessToken: String) {
    mSharedPreferences = mContext.getSharedPreferences("", Context.MODE_PRIVATE)
    val editor = mSharedPreferences.edit()
    editor.putString("access_token", accessToken)
    editor.apply()
  }

  override fun getAccessToken() : String {
    mSharedPreferences = mContext.getSharedPreferences("", Context.MODE_PRIVATE)
    return mSharedPreferences.getString("access_token", null)
  }

}