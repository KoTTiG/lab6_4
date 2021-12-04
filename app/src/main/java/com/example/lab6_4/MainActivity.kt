package com.example.lab6_4

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import java.net.URL


class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private val imageUrl = URL("https://sun9-29.userapi.com/impg/ykoWHS26aTIBOcQPg5pPMFMNrW-lipy7POi_5g/ARBrfKLtvLE.jpg?size=750x930&quality=96&sign=9b3bda4acd79aae79aa60256535dbb06&type=album")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn).setOnClickListener(::getImage)
    }

    override fun onStart() {
        super.onStart()
        imageView = findViewById(R.id.image)
    }

    private fun getImage(view: View) {
        Glide
            .with(this)
            .load(imageUrl.toString())
            .into(imageView)
    }
}