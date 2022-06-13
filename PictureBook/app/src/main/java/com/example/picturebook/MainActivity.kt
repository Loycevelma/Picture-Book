package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
//    lateinit var tvTitle: TextView
//    lateinit var imBag: ImageView
//    lateinit var tvIntro: TextView
    lateinit var btn1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        castViews()
        clickButton()

    }
    fun castViews(){
//        tvTitle=findViewById(R.id.tvTitle)
//        tvIntro=findViewById(R.id.tvIntro)
//        imBag=findViewById(R.id.imBag)
        btn1=findViewById(R.id.btn1)

    }
    fun clickButton(){
        btn1.setOnClickListener {
            var intent=Intent(baseContext,Picture1::class.java)
            startActivity(intent)
        }


    }
}