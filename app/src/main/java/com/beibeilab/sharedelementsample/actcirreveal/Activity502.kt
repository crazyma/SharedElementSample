package com.beibeilab.sharedelementsample.actcirreveal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import com.beibeilab.sharedelementsample.R
import com.beibeilab.sharedelementsample.Util
import kotlinx.android.synthetic.main.activity_501.*

class Activity502 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_502)

        val color = ContextCompat.getColor(this, R.color.colorAccent)
        circularImageView.background =
                Util.createOvalDrawable(color, R.dimen.view_small)
    }
}
