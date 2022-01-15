package com.rifqipadisiliwagi.matrix.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.rifqipadisiliwagi.matrix.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val klik = findViewById<Button>(R.id.btnlogin)
        klik.setOnClickListener {
            val gas = Intent(this, DashboardActivity::class.java)
            Toast.makeText(this, "Welcome to Matrix", Toast.LENGTH_SHORT).show()
            startActivity(gas)
            finish()
        }

        val klik1 = findViewById<TextView>(R.id.tvsignup)
        klik1.setOnClickListener {
            val gas1 = Intent(this, SignUpActivity::class.java)
            startActivity(gas1)
            finish()
        }

        val klik2 = findViewById<TextView>(R.id.tv_forget_password)
        klik2.setOnClickListener {
            val gas1 = Intent(this, ForgetActivity::class.java)
            startActivity(gas1)
        }
    }
}