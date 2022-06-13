package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Delivery : AppCompatActivity() {
//    lateinit var imShop: ImageView
//    lateinit var tvFin: TextView
//    lateinit var tvThanks: TextView
    lateinit var btn10: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delivery)
        castViews6()
        clickButton7()
    }

    fun castViews6() {
//        tvFin = findViewById(R.id.tvFin)
//        tvThanks = findViewById(R.id.tvThanks)
//        imShop = findViewById(R.id.imshop)
        btn10 = findViewById(R.id.btn10)

    }

    fun clickButton7() {
        btn10.setOnClickListener {
            var intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }

    }
}