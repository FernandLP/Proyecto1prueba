package com.example.basiclogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btnIS = findViewById<Button>(R.id.buttonIS)
        val ptUser = findViewById<EditText>(R.id.pt_user)
        val ptPassword = findViewById<EditText>(R.id.pt_password)

        val ptNickname = findViewById<EditText>(R.id.pt_nickname)



        btnIS.setOnClickListener {
            val user = ptUser.text.toString()
            val password = ptPassword.text.toString()
            val nickname = ptNickname.text.toString()

            if (user == "Eduardo") {
                if (password == "1234") {
                    val intent = Intent(this, Activity2::class.java)
                    intent.putExtra("user", user)

                    val sharedPref = this.getSharedPreferences("MySharedPrefer", MODE_PRIVATE)
                    with (sharedPref.edit()) {
                        putString("nickname", nickname)
                        apply()
                    }

                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Nombre incorrecto", Toast.LENGTH_SHORT).show()
            }
        }



    }
}