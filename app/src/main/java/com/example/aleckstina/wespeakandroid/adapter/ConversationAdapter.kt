package com.example.aleckstina.wespeakandroid.adapter

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.aleckstina.wespeakandroid.R
import com.example.aleckstina.wespeakandroid.databinding.ConversationItemBinding
import com.example.aleckstina.wespeakandroid.model.User
import android.content.ClipData.Item
import android.databinding.BindingAdapter
import android.media.Image
import android.net.Uri
import android.util.Log
import com.android.databinding.library.baseAdapters.BR
import com.bumptech.glide.Glide


/**
 * Created by aleckstina on 10/14/17.
 */

class ConversationAdapter : RecyclerView.Adapter<ConversationAdapter.ViewHolder>() {
  val user = User("Erlich Bachman", "https://media.licdn.com/mpr/mpr/shrinknp_200_200/AAEAAQAAAAAAAAh-AAAAJDA3NTM0ODEyLTlhODQtNDZlNi1hMjE5LTRlMWIyNDFiZDY0Zg.jpg")
  val user_2 = User("Richard Hendricks", "https://media.licdn.com/mpr/mpr/shrinknp_200_200/p/6/005/069/06b/2a8cd67.jpg")
  val user_3 = User("Gavin Belson", "https://pixel.nymag.com/imgs/daily/vulture/2016/05/23/23-matt-ross-cannes.w245.h368.jpg")
  val user_4 = User("Jared Dunn", "https://vignette.wikia.nocookie.net/silicon-valley/images/c/c9/Silicon-Valley-Wikia_infobox-Jared-Dunn_01.jpg/revision/latest?cb=20140407101454")
  val user_5 = User("Big Head", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTUxNzE2MTYwNV5BMl5BanBnXkFtZTgwNzk2NTk2ODE@._V1_UY1200_CR585,0,630,1200_AL_.jpg")
  val user_6 = User("Gilfoyle Betram", "https://pbs.twimg.com/profile_images/725321660484583424/ArQ4fM3k.jpg")
  val list = listOf<User>(user, user_2, user_3, user_4, user_5, user_6)

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val user = list[position]
    holder.bind(user)
  }
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ConversationAdapter.ViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.conversation_item, parent, false)
    val itemBinding : ViewDataBinding =
      ConversationItemBinding.bind(view)
    return ViewHolder(itemBinding)
  }

  override fun getItemCount(): Int = list.size

  inner class ViewHolder(private var binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(user: User) {
      binding.run {
        setVariable(BR.user, user)
        executePendingBindings()
      }
    }
  }

}