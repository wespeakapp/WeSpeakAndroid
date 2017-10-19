package com.example.aleckstina.wespeakandroid.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.databinding.library.baseAdapters.BR
import com.example.aleckstina.wespeakandroid.R
import com.example.aleckstina.wespeakandroid.databinding.ProfileFragmentBinding
import com.example.aleckstina.wespeakandroid.model.User

/**
 * Created by aleckstina on 10/6/17.
 */
class ProfileFragment : Fragment() {
  private var mPage : Int = 0

  override fun onCreate(savedInstanceState: Bundle?) {
    mPage = arguments.getInt(ARG_PAGE);
    super.onCreate(savedInstanceState)

  }

  override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
    val test_user = User("Elon Musk", "https://i.ytimg.com/vi/tnBQmEqBCY0/maxresdefault.jpg")
    val mProfileView = inflater?.inflate(R.layout.profile_fragment, container, false)
    val binding : ProfileFragmentBinding = DataBindingUtil.bind(mProfileView)
    binding.setVariable(BR.user, test_user)
    return binding.root

  }

  companion object {
    val ARG_PAGE = "ARG_PAGE"
    fun newInstance(page: Int) : ProfileFragment {
      val args = Bundle()
      args.putInt(ARG_PAGE, page)
      val fragment = ProfileFragment()
      fragment.arguments = args
      return fragment
    }
  }

}