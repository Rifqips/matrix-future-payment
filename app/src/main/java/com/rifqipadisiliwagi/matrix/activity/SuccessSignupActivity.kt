package com.rifqipadisiliwagi.matrix.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.rifqipadisiliwagi.matrix.R

class SuccessSignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success_signup)

        val klik1 = findViewById<TextView>(R.id.tv_tap_next)
        klik1.setOnClickListener {
            val gas1 = Intent(this, DashboardActivity::class.java)
            startActivity(gas1)
            finish()
        }
    }
}