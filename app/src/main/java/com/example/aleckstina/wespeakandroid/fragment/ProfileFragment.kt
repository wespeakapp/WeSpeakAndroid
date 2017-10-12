package com.example.aleckstina.wespeakandroid.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aleckstina.wespeakandroid.R

/**
 * Created by aleckstina on 10/6/17.
 */
class ProfileFragment : Fragment() {
    private var mPage : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        mPage = arguments.getInt(ARG_PAGE);
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? =
      inflater?.inflate(R.layout.profile_fragment, container, false)

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