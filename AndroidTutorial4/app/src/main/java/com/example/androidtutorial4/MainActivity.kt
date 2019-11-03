package com.example.androidtutorial4

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
            d("Jay", "Hello ${editText.text}!")
            helloMsg.text = "Hello, ${editText.text}!!!"
        }
    }
}
