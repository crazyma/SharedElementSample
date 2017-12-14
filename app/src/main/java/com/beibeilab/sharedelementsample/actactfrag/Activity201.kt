package com.beibeilab.sharedelementsample.actactfrag

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.beibeilab.sharedelementsample.R
import kotlinx.android.synthetic.main.activity_201.*

/**
 * Created by david on 2017/12/13.
 */
class Activity201 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_201)

        button201.setOnClickListener {
            var intent = Intent(this, Activity202::class.java)
            startActivity(intent)
        }
    }
}