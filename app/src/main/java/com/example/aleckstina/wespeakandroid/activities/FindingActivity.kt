package com.example.aleckstina.wespeakandroid.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation
import com.bumptech.glide.request.RequestOptions

import com.example.aleckstina.wespeakandroid.R
import com.example.aleckstina.wespeakandroid.fragment.PopupDialogFragment
import jp.wasabeef.glide.transformations.BlurTransformation

class FindingActivity : AppCompatActivity() {
  private lateinit var mActivityImage : ImageView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_finding)
    supportActionBar!!.hide()
    mActivityImage = findViewById(R.id.finding_activity_bg)
    setImageForActivity()
    Handler().postDelayed(Runnable {
      activateDialogFragment()
    }, 5000)
  }

  private fun setImageForActivity() {
    Glide
      .with(this)
      .load(R.mipmap.bg_blurred)
      .into(mActivityImage)

    Glide
      .with(this)
      .load(R.mipmap.close_btn)
      .into(findViewById<ImageView>(R.id.close_btn))
  }

  private fun activateDialogFragment() {
    val popUpDialogFragment = PopupDialogFragment.newInstance("Haha")
    popUpDialogFragment.show(fragmentManager, "Haha")
  }
}
