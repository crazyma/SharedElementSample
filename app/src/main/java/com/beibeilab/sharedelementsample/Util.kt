package com.beibeilab.sharedelementsample

import android.graphics.drawable.GradientDrawable

/**
 * Created by david on 2017/12/29.
 */
class Util {

    companion object {
        fun createOvalDrawable(color: Int, radius: Int): GradientDrawable {
            val gradientDrawable = GradientDrawable()
            gradientDrawable.setSize(radius, radius)
            gradientDrawable.shape = GradientDrawable.OVAL
            gradientDrawable.setColor(color)
            return gradientDrawable
        }
    }
}