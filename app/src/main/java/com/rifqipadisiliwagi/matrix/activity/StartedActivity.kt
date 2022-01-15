package com.rifqipadisiliwagi.matrix.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.rifqipadisiliwagi.matrix.R

class StartedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_started)

        val klik = findViewById<Button>(R.id.btnstarted)
        klik.setOnClickListener{
        val gas = Intent(this, LoginActivity::class.java)
        startActivity(gas)
            finish()
        }

    }
}