package com.example.a3buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tvAll: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tvAll = findViewById(R.id.tvAll)

        val sent = intent.getStringExtra("Information")
        tvAll.text = sent
    }
}