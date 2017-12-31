package com.beibeilab.sharedelementsample.actcirreveal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.transition.Transition
import android.transition.TransitionInflater
import android.util.Log
import android.view.View
import android.view.ViewAnimationUtils
import com.beibeilab.sharedelementsample.R
import com.beibeilab.sharedelementsample.Util
import kotlinx.android.synthetic.main.activity_502.*

class Activity502 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_502)

        val color = ContextCompat.getColor(this, R.color.colorAccent)
        circularImageView.background =
                Util.createOvalDrawable(color, R.dimen.view_small)

        setupEnterAnimation()
    }

    private fun setupEnterAnimation() {
        val transition = TransitionInflater.from(this)
                .inflateTransition(R.transition.acr_motion)
        window.sharedElementEnterTransition = transition

        transition.addListener(object : Transition.TransitionListener {
            override fun onTransitionEnd(p0: Transition?) {
                Log.i("crazyma", "onTransitionEnd")
                revealAnim(newBaseLayout)
            }

            override fun onTransitionResume(p0: Transition?) {
                Log.i("crazyma", "onTransitionResume")
            }

            override fun onTransitionPause(p0: Transition?) {
                Log.i("crazyma", "onTransitionPause")
            }

            override fun onTransitionCancel(p0: Transition?) {
                Log.i("crazyma", "onTransitionCancel")
            }

            override fun onTransitionStart(p0: Transition?) {
                Log.i("crazyma", "onTransitionStart")
            }

        })
    }

    fun buttonClicked(view: View) {

    }

    private fun revealAnim(view: View) {
        val cx = (circularImageView.x + circularImageView.width / 2).toInt()
        val cy = (circularImageView.y + circularImageView.height / 2).toInt()
        val finalRadius = Math.max(baseLayout.width, baseLayout.height)

        val anim = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0f, finalRadius.toFloat())
        anim.setDuration(500)
        view.visibility = View.VISIBLE
        anim.start()
    }
}
