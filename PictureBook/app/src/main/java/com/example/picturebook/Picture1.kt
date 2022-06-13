package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Picture1 : AppCompatActivity() {
//    lateinit var tv1: TextView
//    lateinit var imOrange: ImageView
//    lateinit var tvOrange: TextView
//    lateinit var tvOp: TextView
    lateinit var btn2: Button
    lateinit var btn3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture1)
        castViews1()
        clickButton2()
    }

    fun castViews1() {
//        tv1 = findViewById(R.id.tv1)
//        tvOrange = findViewById(R.id.tvOrange)
//        tvOp = findViewById(R.id.tvOp)
//        imOrange = findViewById(R.id.imOrange)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)

    }

    fun clickButton2() {
        btn2.setOnClickListener {
            var intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            var intent = Intent(baseContext, Picture2::class.java)
            startActivity(intent)
        }

    }
}