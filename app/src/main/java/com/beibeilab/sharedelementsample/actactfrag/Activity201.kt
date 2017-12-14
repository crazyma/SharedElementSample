package com.beibeilab.sharedelementsample.actactfrag

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.app.AppCompatActivity
import com.beibeilab.sharedelementsample.R
import kotlinx.android.synthetic.main.activity_201.*
import android.support.v4.util.Pair
import android.view.View

/**
 * Created by david on 2017/12/13.
 */
class Activity201 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_201)

        button201.setOnClickListener {
            jump()
        }
    }

    private fun jump() {
        var intent = Intent(this, Activity202::class.java)

        val transTextView = textView201

        val textPair = Pair.create(transTextView as View, "tTextView200")

        val option = ActivityOptionsCompat.makeSceneTransitionAnimation(this, textPair);

        ActivityCompat.startActivity(this, intent, option.toBundle())
    }
}