package com.example.androidtutorial5

import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        button.setOnClickListener {
            d("jay", "Hello, ${editText.text}!!")
            helloText.text = "hello, ${editText.text}!!"

            if (editText.text.toString() == "bad") {
                imageView.setImageResource(R.drawable.bad)
            } else if (editText.text.toString() == "good") {
                imageView.setImageResource(R.drawable.good)
            }

        }

    }
}
