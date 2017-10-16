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
import android.util.Log
import com.android.databinding.library.baseAdapters.BR


/**
 * Created by aleckstina on 10/14/17.
 */

class ConversationAdapter : RecyclerView.Adapter<ConversationAdapter.ViewHolder>() {

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val user = User("Cheese")
    holder.bind(user)
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ConversationAdapter.ViewHolder {
    val itemBinding : ViewDataBinding =
      ConversationItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    return ViewHolder(itemBinding)
  }

  override fun getItemCount(): Int {
    return 1
  }

  inner class ViewHolder(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: User) {
      binding.run {
        setVariable(BR.user, item)
        executePendingBindings()
      }
    }
  }
}