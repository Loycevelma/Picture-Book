package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Picture4 : AppCompatActivity() {
//    lateinit var tv4: TextView
//    lateinit var imBana: ImageView
//    lateinit var tvBan: TextView
//    lateinit var tvBanprice: TextView
    lateinit var btn8: Button
    lateinit var btn9: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture4)
        castViews5()
        clickButton5()

    }
    fun castViews5(){
//        tv4= findViewById(R.id.tv4)
//        tvBan = findViewById(R.id.tvBan)
//        tvBanprice = findViewById(R.id.tvBanprice)
//        imBana = findViewById(R.id.imBana)
        btn8= findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
    }
    fun clickButton5(){
        btn8.setOnClickListener {
            var intent = Intent(baseContext, Picture3::class.java)
            startActivity(intent)
        }
        btn9.setOnClickListener {
            var intent = Intent(baseContext, Delivery::class.java)
            startActivity(intent)
        }

    }

}