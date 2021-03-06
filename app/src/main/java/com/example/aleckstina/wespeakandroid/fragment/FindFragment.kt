package com.example.aleckstina.wespeakandroid.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.aleckstina.wespeakandroid.R
import com.example.aleckstina.wespeakandroid.activities.FindingActivity

/**
 * Created by aleckstina on 10/6/17.
 */
class FindFragment : Fragment() {
    private var mPage : Int = 0
    private lateinit var mFindButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        mPage = arguments.getInt(ARG_PAGE);
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
      val findFragmentView = inflater.inflate(R.layout.find_fragment, container, false)
      mFindButton = findFragmentView.findViewById(R.id.btn_find)
      bindButtonOnClick()
      return findFragmentView
    }

    private fun bindButtonOnClick() {
      mFindButton.setOnClickListener() {
        val intent = Intent(context, FindingActivity::class.java)
        startActivity(intent)
      }
    }

    companion object {
        val ARG_PAGE = "ARG_PAGE"
        fun newInstance(page: Int) : FindFragment {
            val args = Bundle()
            args.putInt(ARG_PAGE, page)
            val fragment = FindFragment()
            fragment.arguments = args
            return fragment
        }
    }


}