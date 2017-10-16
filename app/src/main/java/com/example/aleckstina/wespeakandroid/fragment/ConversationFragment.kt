package com.example.aleckstina.wespeakandroid.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import com.example.aleckstina.wespeakandroid.R
import com.example.aleckstina.wespeakandroid.adapter.ConversationAdapter
import com.example.aleckstina.wespeakandroid.databinding.ConversationFragmentBinding

/**
 * Created by aleckstina on 10/6/17.
 */
class ConversationFragment : Fragment() {
  private var mPage : Int = 0
  private lateinit var binding : ConversationFragmentBinding
  private lateinit var mRvConversation : RecyclerView

  override fun onCreate(savedInstanceState: Bundle?) {
    mPage = arguments.getInt(ARG_PAGE);
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
    binding = DataBindingUtil.inflate(inflater, R.layout.conversation_fragment, container, false)
    mRvConversation = binding.conversationRecycler
    mRvConversation.adapter = ConversationAdapter()
    mRvConversation.layoutManager = LinearLayoutManager(context)
    return binding.root
  }

  companion object {
    val ARG_PAGE = "ARG_PAGE"
    fun newInstance(page: Int) : ConversationFragment {
      val args = Bundle()
      args.putInt(ARG_PAGE, page)
      val fragment = ConversationFragment()
      fragment.arguments = args
      return fragment
    }
  }
}