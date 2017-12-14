package com.beibeilab.sharedelementsample.fragact

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.beibeilab.sharedelementsample.R

/**
 * Created by david on 2017/12/14.
 */
class Activity301 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_301)

        setupFragment()
    }

    private fun setupFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        var fragment = fragmentManager.findFragmentById(R.id.fragment_content)
        if(fragment == null){
            fragment = Fragment301()
            fragmentTransaction.add(R.id.fragment_content, fragment)
            fragmentTransaction.commit()
        }

    }
}