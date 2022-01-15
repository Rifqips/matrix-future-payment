package com.rifqipadisiliwagi.matrix.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.rifqipadisiliwagi.matrix.R

class ExchangeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exchange)

        val klik = findViewById<ImageView>(R.id.iv_back_prof)
        klik.setOnClickListener {
            val gas = Intent(this, DashboardActivity::class.java)
            startActivity(gas)
        }

        val klik1 = findViewById<Button>(R.id.btnbuy)
        klik1.setOnClickListener {
            val gas1 = Intent(this, ConfirmPaymentActivity::class.java)
            startActivity(gas1)
        }

        val klik2 = findViewById<Button>(R.id.btnsell)
        klik2.setOnClickListener {
            val gas2 = Intent(this, ConfirmPaymentActivity::class.java)
            startActivity(gas2)
        }
    }
}