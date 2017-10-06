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
class FindFragment : Fragment() {
    private var mPage : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        mPage = getArguments().getInt(ARG_PAGE);
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.find_fragment, container, false)
        return view
    }

    companion object {
        val ARG_PAGE = "ARG_PAGE"
        fun newInstance(page: Int) : FindFragment {
            val args = Bundle()
            args.putInt(ARG_PAGE, page)
            val fragment = FindFragment()
            fragment.setArguments(args)
            return fragment
        }
    }


}