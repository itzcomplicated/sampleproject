package com.tca.myapplication

import android.content.Context
import android.graphics.Point
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.PopupWindow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handler = Handler()
        handler.postDelayed(Runnable {
            val layoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val inflatedView = layoutInflater.inflate(R.layout.keyboard_holder, null, false)

            val display = windowManager.defaultDisplay
            val size = Point()
            display.getSize(size)

            val popupwindow = PopupWindow(inflatedView, size.x, 200, true)
            popupwindow.showAtLocation(findViewById(android.R.id.content), Gravity.BOTTOM, 0, 40)

        }, 100)


    }
}
