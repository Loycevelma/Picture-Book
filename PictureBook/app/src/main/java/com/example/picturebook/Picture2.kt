package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Picture2 : AppCompatActivity() {
//    lateinit var tv2: TextView
//    lateinit var imPines: ImageView
//    lateinit var tvPine: TextView
//    lateinit var tvPprice: TextView
    lateinit var btn4: Button
    lateinit var btn5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture2)
        castViews3()
        clickButton3()
    }
    fun castViews3(){
//        tv2 = findViewById(R.id.tv2)
//        tvPine = findViewById(R.id.tvOrange)
//        tvPprice = findViewById(R.id.tvOp)
//        imPines = findViewById(R.id.imOrange)
        btn4= findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)

    }
    fun clickButton3(){
        btn4.setOnClickListener {
            var intent = Intent(baseContext, Picture1::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {
            var intent = Intent(baseContext, Picture3::class.java)
            startActivity(intent)
        }

    }
}