package com.example.app

import android.os.Bundle
import android.util.Log.d
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        term.setOnCheckedChangeListener { buttonView, isChecked ->
            d("jay", "Changed! $isChecked")
            if (isChecked) {
                button.visibility = View.VISIBLE
                supportFragmentManager.beginTransaction()
                    .replace(R.id.ourFrameLayout, FirstFragment())
                    .commit()
            } else {
                button.visibility = View.GONE
            }
        }
    }
}
