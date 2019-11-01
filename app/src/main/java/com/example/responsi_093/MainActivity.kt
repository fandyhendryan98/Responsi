package com.example.responsi_093

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.id_username)
        val password = findViewById<EditText>(R.id.id_password)

        btn_login.setOnClickListener(){
            if (username.text.toString() == "fandy" && password.text.toString() == "hendryan"){
                intent = Intent(this, HomeActivity:: class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext, "Username dan Password Anda Salah", Toast.LENGTH_LONG).show()
            }
        }
        btn_sign_up.setOnClickListener(){
            intent = Intent (this, RegisterActivity:: class.java)
            startActivity(intent)
        }
        }

    }

