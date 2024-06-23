package com.example.laba7

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var counter = 0
    private var counter1 = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            textView.text = "Hello, friend!"
        }

        val counterButton = findViewById<Button>(R.id.button_count)
        counterButton.setOnClickListener {
            textView.text = "Я нажал на кнопку ${++counter} раз"
        }

        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setOnClickListener {
            textView.text = "Я тапнул ${++counter1} раз"
        }


    }
}