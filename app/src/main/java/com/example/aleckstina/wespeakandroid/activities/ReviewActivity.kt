package com.example.aleckstina.wespeakandroid.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.example.aleckstina.wespeakandroid.R

class ReviewActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_review)
    supportActionBar!!.hide()
  }
}
