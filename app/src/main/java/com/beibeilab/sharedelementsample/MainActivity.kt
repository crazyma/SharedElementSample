package com.beibeilab.sharedelementsample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.view.View
import android.widget.Toast
import com.beibeilab.sharedelementsample.actact.Activity101
import com.beibeilab.sharedelementsample.actactfrag.Activity201
import com.beibeilab.sharedelementsample.actcirreveal.Activity501
import com.beibeilab.sharedelementsample.actcirreveal.Activity502
import com.beibeilab.sharedelementsample.fragact.Activity301
import com.beibeilab.sharedelementsample.fragfrag.Activity401
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupButtonClickEvent()
    }

    /**
     * Demo different ways to implement Listener
     */
    private fun setupButtonClickEvent(){
        /*  Anonymous inner classes | Object Expression */
        button1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val intent = Intent(this@MainActivity, Activity101::class.java)
                startActivity(intent)
            }

        })

        /*  Lambda with parameter   */
        button2.setOnClickListener {
            startActivity(Intent(this@MainActivity, Activity201::class.java))
        }

        /*  Lambda without parameter   */
        button3.setOnClickListener { startActivity(Intent(this@MainActivity, Activity301::class.java)) }

        /*  Object Expression   */
        var clickListener4 = object : View.OnClickListener {
            override fun onClick(p0: View?) {
                startActivity(Intent(this@MainActivity, Activity401::class.java))
            }
        }
        button4.setOnClickListener(clickListener4)

        /*  Inner Class */
        val clickListener5 = ClickListener5()
        button5.setOnClickListener(clickListener5)
    }

    //  記得要加 `inner` 才可以 access 到 Outer Class
    inner class ClickListener5 : View.OnClickListener {
        override fun onClick(view: View?) {
            val intent = Intent(this@MainActivity, Activity501::class.java)
            startActivity(intent)
        }

    }

    companion object ImageUrl{
        val imageUrlMario = "https://cdn.vox-cdn.com/uploads/chorus_asset/file/9541193/mario_odyssey_review_screen_2.jpg"
        val imageUrlPicasso = "http://i.imgur.com/DvpvklR.png"
    }

}
