package com.example.aleckstina.wespeakandroid.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation
import com.bumptech.glide.request.RequestOptions

import com.example.aleckstina.wespeakandroid.R
import jp.wasabeef.glide.transformations.BlurTransformation

class FindingActivity : AppCompatActivity() {
  private lateinit var mActivityImage : ImageView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_finding)
    supportActionBar!!.hide()
    mActivityImage = findViewById(R.id.finding_activity_bg)
    setImageForActivity()
  }

  private fun setImageForActivity() {
    Glide
      .with(this)
      .load(R.mipmap.bg_blurred)
      .into(mActivityImage)
  }
}
