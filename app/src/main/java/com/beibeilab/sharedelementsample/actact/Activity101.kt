package com.beibeilab.sharedelementsample.actact

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.beibeilab.sharedelementsample.R
import kotlinx.android.synthetic.main.activity_101.*

/**
 * Created by david on 2017/12/13.
 */
class Activity101: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_101)

        button.setOnClickListener { jump() }
    }

    fun jump() {
        val intent = Intent(this, Activity102::class.java)
        startActivity(intent)
    }

}