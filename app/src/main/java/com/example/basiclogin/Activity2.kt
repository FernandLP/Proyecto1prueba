package com.example.basiclogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val tv_welcome = findViewById<TextView>(R.id.tv_wel)
        val userName = intent.getStringExtra("user")

        val sharedPref = this.getSharedPreferences("MySharedPrefer", MODE_PRIVATE)
        val nickname = sharedPref.getString("nickname", "")

        tv_welcome.append(" " + nickname)


    }
}