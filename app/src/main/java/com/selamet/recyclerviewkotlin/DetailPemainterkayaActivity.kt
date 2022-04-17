package com.selamet.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailPemainterkayaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pemainterkaya)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val pemainterkaya = intent.getParcelableExtra<Pemainterkaya>(MainActivity.INTENT_PARCELABLE)

        val imgPemainterkaya = findViewById<ImageView>(R.id.img_item_photo)
        val namePemainterkaya = findViewById<TextView>(R.id.tv_item_name)
        val descPemainterkaya = findViewById<TextView>(R.id.tv_item_description)

        imgPemainterkaya.setImageResource(pemainterkaya?.imgPemainterkaya!!)
        namePemainterkaya.text = pemainterkaya.namePemainterkaya
        descPemainterkaya.text = pemainterkaya.descPemainterkaya

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}