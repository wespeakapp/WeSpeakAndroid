package com.example.aleckstina.wespeakandroid.model

import com.google.gson.annotations.SerializedName
import android.graphics.Movie



/**
 * Created by aleckstina on 11/15/17.
 */
class AccessTokenModel {
  @SerializedName("access_token")
  private var access_token: String = ""

  fun getAccessToken(): String = access_token

  fun setAccessToken(access_token: String) {
    this.access_token = access_token
  }
}