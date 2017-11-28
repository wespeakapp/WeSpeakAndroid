package com.example.aleckstina.wespeakandroid.http

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by aleckstina on 10/6/17.
 */

@Singleton
class ApiClient {
  companion object {
    private var mApiClientInstance: ApiClient? = null
    public final val BASE_URL = "http://35.188.157.198:3000/"
    private var retrofit: Retrofit? = null


    // Thread Safe
    @Synchronized
    public fun getInstance(): ApiClient {
      if (mApiClientInstance == null) {
        mApiClientInstance = ApiClient()
      }
      return mApiClientInstance as ApiClient
    }
  }
  public fun buildRetrofit(): Retrofit {
    if (retrofit == null) {
      retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    }
    return retrofit as Retrofit
  }

  public fun getApiService() : ApiInterface = buildRetrofit().create(ApiInterface::class.java)
}