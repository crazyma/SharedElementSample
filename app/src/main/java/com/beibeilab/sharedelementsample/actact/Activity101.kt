package com.beibeilab.sharedelementsample.actact

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.beibeilab.sharedelementsample.R
import kotlinx.android.synthetic.main.activity_101.*
import android.support.v4.util.Pair
import com.beibeilab.sharedelementsample.MainActivity
import com.squareup.picasso.Picasso

/**
 * Created by david on 2017/12/13.
 */
class Activity101 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_101)

        button.setOnClickListener { jump() }
        Picasso.with(this).load(MainActivity.imageUrlPicasso).into(imageView2)
    }

    fun jump() {
        val intent = Intent(this, Activity102::class.java)

        val transTextView = textView
        val transImageView = imageView
        val transImageView2 = imageView2

        val textPair = Pair.create(transTextView as View, "tTextView")
        val imagePair = Pair.create(transImageView as View, "tImageView")
        val image2Pair = Pair.create(transImageView2 as View, "tImageView2")

        val option = ActivityOptionsCompat.makeSceneTransitionAnimation(this, textPair, imagePair, image2Pair)

        ActivityCompat.startActivity(this, intent, option.toBundle())
    }

}