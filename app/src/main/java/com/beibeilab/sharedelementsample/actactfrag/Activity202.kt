package com.beibeilab.sharedelementsample.actactfrag

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.beibeilab.sharedelementsample.R

/**
 * Created by david on 2017/12/13.
 */
class Activity202: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_202)

        setupFragment()
    }

    private fun setupFragment() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()

        var fragment = supportFragmentManager.findFragmentById(R.id.fragment_content)
        if(fragment == null){
            fragment = Fragment202()
            fragmentTransaction.add(R.id.fragment_content, fragment)
        }
        fragmentTransaction.commit()
    }

}