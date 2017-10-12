package com.example.aleckstina.wespeakandroid.fragment

import android.app.DialogFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.aleckstina.wespeakandroid.R

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

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
    val dialogView = inflater.inflate(R.layout.popup_fragment, container, false)
    setAvatar(dialogView)
    return dialogView
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