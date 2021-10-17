package com.example.a3buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etAge: EditText
    lateinit var etCity: EditText
    lateinit var toa: Button
    lateinit var tv: Button
    lateinit var go: Button
    lateinit var tvSh: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName)
        etAge = findViewById(R.id.etAge)
        etCity = findViewById(R.id.etCity)
        toa = findViewById(R.id.buttonTo)
        tv = findViewById(R.id.buttonTv)
        go = findViewById(R.id.buttonGo)
        tvSh = findViewById(R.id.tvSh)

        toa.setOnClickListener{
            val aName = etName.text.toString()
            Toast.makeText(applicationContext, aName, Toast.LENGTH_SHORT).show()
            etName.text.clear()
            etName.clearFocus()
        }

        tv.setOnClickListener{
            val anAge = etAge.text.toString().toInt()
            tvSh.text = "Your Age is $anAge"
            etAge.text.clear()
            etAge.clearFocus()
        }

        go.setOnClickListener{
            val Information = "Your name is ${etName.text}\n Your age is ${etAge.text.toString().toInt()}\n Your city of birth is ${etCity.text}"
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Information", Information)
            startActivity(intent)
        }
    }
}