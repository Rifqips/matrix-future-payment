package com.rifqipadisiliwagi.matrix.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.rifqipadisiliwagi.matrix.R

class TransactionHistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction_history)

        val klik = findViewById<ImageView>(R.id.iv_back_prof)
        klik.setOnClickListener {
            val gas = Intent(this, DashboardActivity::class.java)
            startActivity(gas)
        }
    }
}