package com.rifqipadisiliwagi.matrix.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.rifqipadisiliwagi.matrix.R

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val klik = findViewById<ImageView>(R.id.iv_back_prof)
        klik.setOnClickListener {
            val gas = Intent(this, DashboardActivity::class.java)
            startActivity(gas)
        }

        val klik1 = findViewById<Button>(R.id.btnLogout)
        klik1.setOnClickListener {
            val gas1 = Intent(this, LoginActivity::class.java)
            startActivity(gas1)
            finish()
        }
    }
}