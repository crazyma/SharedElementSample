package com.beibeilab.sharedelementsample.fragfrag

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.beibeilab.sharedelementsample.R
import com.beibeilab.sharedelementsample.fragact.Fragment301

/**
 * Created by david on 2017/12/15.
 */
class Activity401: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_401)

        setupFragment()
    }

    private fun setupFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        var fragment = fragmentManager.findFragmentById(R.id.fragment_content)
        if(fragment == null){
            fragment = Fragment401()
            fragmentTransaction.add(R.id.fragment_content, fragment)
            fragmentTransaction.commit()
        }
    }

    fun switchFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        var fragment = Fragment402()
        fragmentTransaction.replace(R.id.fragment_content, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()

    }
}