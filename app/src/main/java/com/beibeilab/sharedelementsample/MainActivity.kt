package com.beibeilab.sharedelementsample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.beibeilab.sharedelementsample.actact.Activity101
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
        button2.setOnClickListener { view -> {Toast.makeText(this, "button 2 click", Toast.LENGTH_SHORT).show()} }

        /*  Lambda without parameter   */
        button3.setOnClickListener { Toast.makeText(this, "button 3 click", Toast.LENGTH_SHORT).show() }

        /*  Object Expression   */
        var clickListener4 = object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, "button 4 click", Toast.LENGTH_SHORT).show()
            }
        }
        button4.setOnClickListener(clickListener4)

        /*  Inner Class */
        val clickListener5 = ClickListener5()
        button5.setOnClickListener(clickListener5)
    }

    class ClickListener5 : View.OnClickListener {
        override fun onClick(view: View?) {
            Toast.makeText(view!!.context, "button 5 click", Toast.LENGTH_SHORT).show()
        }

    }

    companion object ImageUrl{
        val imageUrlMario = "https://cdn.vox-cdn.com/uploads/chorus_asset/file/9541193/mario_odyssey_review_screen_2.jpg"
        val imageUrlPicasso = "http://i.imgur.com/DvpvklR.png"
    }

}
