package com.rifqipadisiliwagi.matrix.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.rifqipadisiliwagi.matrix.R

class ConfirmPaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_payment)

        val klik = findViewById<ImageView>(R.id.iv_back_prof)
        klik.setOnClickListener {
            val gas = Intent(this, DashboardActivity::class.java)
            startActivity(gas)
        }

        val klik1 = findViewById<Button>(R.id.btn_confirm_payment)
        klik1.setOnClickListener {
            val gas1 = Intent(this, AuthenticationActivity::class.java)
            startActivity(gas1)
        }

        val klik2 = findViewById<Button>(R.id.btn_cancel_payment)
        klik2.setOnClickListener {
            val gas2 = Intent(this, ExchangeActivity::class.java)
            startActivity(gas2)
        }
    }
}