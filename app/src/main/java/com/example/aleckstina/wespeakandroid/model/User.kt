package com.example.aleckstina.wespeakandroid.model

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.android.databinding.library.baseAdapters.BR

/**
 * Created by aleckstina on 10/6/17.
 */
class User(email: String) : BaseObservable() {
  @Bindable
  private lateinit var email: String

  public fun getEmail(): String = this.email

  public fun setEmail(email: String) {
    this.email = email
    notifyPropertyChanged(BR.email)
  }

  init {
    setEmail(email)
  }

}