package com.rifqipadisiliwagi.matrix.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.rifqipadisiliwagi.matrix.R

class ForgetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget)

        val klik = findViewById<Button>(R.id.btnreset)
        klik.setOnClickListener {
            val gas = Intent(this, LoginActivity::class.java)
            Toast.makeText(this, "Reset Succesfully", Toast.LENGTH_SHORT).show()
            startActivity(gas)
            finish()
        }
    }
}