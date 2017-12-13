package com.beibeilab.sharedelementsample.actact

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.beibeilab.sharedelementsample.MainActivity
import com.beibeilab.sharedelementsample.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_101.*

/**
 * Created by david on 2017/12/13.
 */
class Activity102: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_102)

        Picasso.with(this).load(MainActivity.imageUrlPicasso).into(imageView2)
    }
}