package com.rifqipadisiliwagi.matrix.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.rifqipadisiliwagi.matrix.R

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val klik = findViewById<ImageView>(R.id.circleImageView)
        klik.setOnClickListener {
            val gas = Intent(this, ProfileActivity::class.java)
            startActivity(gas)
        }

        val klik1 = findViewById<TextView>(R.id.tv_detils)
        klik1.setOnClickListener {
            val gas1 = Intent(this, ChooseCurrencyActivity::class.java)
            startActivity(gas1)
        }

        val klik2 = findViewById<TextView>(R.id.tv_default_your_bank)
        klik2.setOnClickListener {
            val gas2 = Intent(this, VirtualAccountActivity::class.java)
            startActivity(gas2)
        }

        val klik3 = findViewById<ImageView>(R.id.iv_ic_dash4)
        klik3.setOnClickListener {
            val gas3 = Intent(this, ExchangeActivity::class.java)
            startActivity(gas3)
        }

        val klik4 = findViewById<ImageView>(R.id.iv_ic_dash3)
        klik4.setOnClickListener {
            val gas4 = Intent(this, TransactionHistoryActivity::class.java)
            startActivity(gas4)
        }

        val klik5 = findViewById<ImageView>(R.id.iv_ic_dash2)
        klik5.setOnClickListener {
            val gas5 = Intent(this, MyQrScanner::class.java)
            startActivity(gas5)
        }

        val klik6 = findViewById<ImageView>(R.id.iv_ic_dash1)
        klik6.setOnClickListener {
            val gas6 = Intent(this, ProfileActivity::class.java)
            startActivity(gas6)
        }

        val kliknews = findViewById<ImageView>(R.id.image1)
        kliknews.setOnClickListener {
            val gasnews = Intent(this, NewsActivity::class.java)
            startActivity(gasnews)
        }
    }
}