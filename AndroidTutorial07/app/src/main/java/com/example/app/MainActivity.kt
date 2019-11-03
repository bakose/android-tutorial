package com.example.app

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        textView.setOnClickListener {
            Toast.makeText(this, "Welcome to my app :)", Toast.LENGTH_LONG).show()
        }
        imageView.setOnClickListener {
            Snackbar.make(constaintLayoutTag, "Thanks!", Snackbar.LENGTH_LONG).show()
        }
    }
}
