package com.beibeilab.sharedelementsample.fragact

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.beibeilab.sharedelementsample.R
import kotlinx.android.synthetic.main.fragment_301.*
import android.support.v4.util.Pair

/**
 * Created by david on 2017/12/14.
 */
class Fragment301 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_301, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button333.setOnClickListener { jump() }
    }

    private fun jump() {
        val intent = Intent(activity, Activity302::class.java)

        val textPair = Pair.create(textView301 as View, "tTextView333")
        val option = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, textPair)

        ActivityCompat.startActivity(activity, intent, option.toBundle())

    }
}