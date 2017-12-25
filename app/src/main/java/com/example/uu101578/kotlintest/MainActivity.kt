package com.example.uu101578.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ボタン発火イベント
        val button = findViewById(R.id.button) as Button
        button.setOnClickListener{
            println("Hellow Kotlin!")
        }
    }
}
