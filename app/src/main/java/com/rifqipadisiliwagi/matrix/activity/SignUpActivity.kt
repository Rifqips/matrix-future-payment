package com.rifqipadisiliwagi.matrix.activity

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.rifqipadisiliwagi.matrix.R

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val klik = findViewById<Button>(R.id.btnsignup)
        klik.setOnClickListener {
            val gas = Intent(this, AuthSignUpActivity::class.java)
            startActivity(gas)
            finish()
        }
//        btn_button.setOnClickListener{
//            sendNotification()
//        }
    }
}