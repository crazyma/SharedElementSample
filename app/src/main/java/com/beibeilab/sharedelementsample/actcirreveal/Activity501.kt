package com.beibeilab.sharedelementsample.actcirreveal

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.content.ContextCompat
import android.support.v4.util.Pair
import android.view.View
import com.beibeilab.sharedelementsample.R
import com.beibeilab.sharedelementsample.Util
import kotlinx.android.synthetic.main.activity_501.*

class Activity501 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_501)

        val color = ContextCompat.getColor(this, R.color.colorAccent)
        circularImageView.background =
                Util.createOvalDrawable(color, R.dimen.view_small)

        button555.setOnClickListener { jump() }
    }

    private fun jump() {
        val intent = Intent(this, Activity502::class.java)

        val transImageView = circularImageView

        val imagePair = Pair.create(transImageView as View, "tImageView")

        val option = ActivityOptionsCompat.makeSceneTransitionAnimation(this, imagePair)

        ActivityCompat.startActivity(this, intent, option.toBundle())
    }
}
