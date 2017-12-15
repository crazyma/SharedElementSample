package com.beibeilab.sharedelementsample.fragfrag

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.beibeilab.sharedelementsample.R
import kotlinx.android.synthetic.main.fragment_401.*

/**
 * Created by david on 2017/12/15.
 */
class Fragment401: Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_401, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener { jump() }
    }

    private fun jump() {
        (activity as Activity401).switchFragment(textView4, "tTextView444")
    }
}