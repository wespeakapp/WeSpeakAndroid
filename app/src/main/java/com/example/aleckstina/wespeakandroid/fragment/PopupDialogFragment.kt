package com.example.aleckstina.wespeakandroid.fragment

import android.annotation.TargetApi
import android.app.DialogFragment
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.aleckstina.wespeakandroid.R
import com.example.aleckstina.wespeakandroid.activities.ReviewActivity

/**
 * Created by aleckstina on 10/12/17.
 */
class PopupDialogFragment() : DialogFragment() {

  companion object {
    public fun newInstance(title: String) : PopupDialogFragment {
      val dialog = PopupDialogFragment()
      val args = Bundle()
      args.putString("title", title)
      dialog.arguments = args
      return dialog
    }
  }

  @TargetApi(Build.VERSION_CODES.M)
  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
    val dialogView = inflater.inflate(R.layout.popup_fragment, container, false)
    setAvatar(dialogView)
    Handler().postDelayed(Runnable {
      activateScreen(context)
    }, 3000)
    return dialogView
  }

  private fun activateScreen(context: Context) {
    startActivity(Intent(context, ReviewActivity::class.java))

  }

  private fun setAvatar(view: View) {
    Glide
      .with(this)
      .load(R.mipmap.avatar_test)
      .apply(RequestOptions.circleCropTransform())
      .into(view.findViewById(R.id.avatar))

    Glide
      .with(this)
      .load(R.mipmap.flag_test)
      .into(view.findViewById(R.id.flag))
  }
}
