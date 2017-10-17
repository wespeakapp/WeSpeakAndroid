package com.example.aleckstina.wespeakandroid.model

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.android.databinding.library.baseAdapters.BR

/**
 * Created by aleckstina on 10/6/17.
 */
class User(email: String, imageUrl: String) : BaseObservable() {
  @Bindable
  private lateinit var email: String

  @Bindable
  private var imageUrl: String = ""

  fun getEmail(): String = this.email
  @Bindable
  fun getImageUrl(): String = this.imageUrl

  @Bindable
  public fun setImageUrl(imageUrl: String) {
    this.imageUrl = imageUrl
    notifyPropertyChanged(BR.imageUrl)
  }

  public fun setEmail(email: String) {
    this.email = email
    notifyPropertyChanged(BR.email)
  }

  init {
    setEmail(email)
    setImageUrl(imageUrl)
  }

}