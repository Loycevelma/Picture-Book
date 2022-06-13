package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Picture3 : AppCompatActivity() {
//    lateinit var tv3: TextView
//    lateinit var imPear: ImageView
//    lateinit var tvPear: TextView
//    lateinit var tvPearp: TextView
    lateinit var btn6: Button
    lateinit var btn7: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture3)
        castViews4()
        clickButton4()
    }
    fun castViews4(){
//        tv3 = findViewById(R.id.tv3)
//        tvPear = findViewById(R.id.tvPear)
//        tvPearp = findViewById(R.id.tvPearP)
//        imPear = findViewById(R.id.imPear)
        btn6= findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
    }
    fun clickButton4(){
        btn6.setOnClickListener {
            var intent = Intent(baseContext, Picture2::class.java)
            startActivity(intent)
        }
        btn7.setOnClickListener {
            var intent = Intent(baseContext, Picture4::class.java)
            startActivity(intent)
        }

    }
    }