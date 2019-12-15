package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivtiy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_activtiy)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("user name")

        val tex = findViewById<TextView>(R.id.text)
        tex.text = msg

    }
}
