package com.example.aleckstina.wespeakandroid.adapter

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.aleckstina.wespeakandroid.model.User

/**
 * Created by aleckstina on 10/17/17.
 */
object CustomBindingAdapter {
  @BindingAdapter("bind:imageUrl")
  @JvmStatic
  fun loadImage(imageView: ImageView, url: String) {
    Glide.with(imageView.context).load(url).apply(RequestOptions.circleCropTransform()).into(imageView)
  }
}