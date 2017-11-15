package com.example.aleckstina.wespeakandroid.http

import com.example.aleckstina.wespeakandroid.model.AccessTokenModel
import com.example.aleckstina.wespeakandroid.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by aleckstina on 11/15/17.
 */
interface ApiInterface {
  @GET("/api/v1/login")
  fun getGeneratedAccessToken(@Query("accessToken") apiKey: String) : Call<AccessTokenModel>
}