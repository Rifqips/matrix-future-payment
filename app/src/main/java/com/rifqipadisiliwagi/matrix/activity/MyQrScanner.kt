package com.rifqipadisiliwagi.matrix.activity

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import com.budiyev.android.codescanner.*
import com.rifqipadisiliwagi.matrix.R
import com.rifqipadisiliwagi.matrix.databinding.ActivityMyQrScannerBinding
import java.util.jar.Manifest


//private const val CAMERA_REQUEST_CODE = 101

class MyQrScanner : AppCompatActivity() {

    private lateinit var binding: ActivityMyQrScannerBinding
    private lateinit var codeScanner: CodeScanner


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyQrScannerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val scannerView = findViewById<CodeScannerView>(R.id.scanner_view)

        codeScanner = CodeScanner(this, scannerView)

        // Parameters (default values)
        codeScanner.camera = CodeScanner.CAMERA_BACK // or CAMERA_FRONT or specific camera id
        codeScanner.formats = CodeScanner.ALL_FORMATS // list of type BarcodeFormat,
        // ex. listOf(BarcodeFormat.QR_CODE)
        codeScanner.autoFocusMode = AutoFocusMode.SAFE // or CONTINUOUS
        codeScanner.scanMode = ScanMode.CONTINUOUS // or CONTINUOUS or PREVIEW
        codeScanner.isAutoFocusEnabled = true // Whether to enable auto focus or not
        codeScanner.isFlashEnabled = true // Whether to enable flash or not

        // Callbacks
        codeScanner.decodeCallback = DecodeCallback {
            runOnUiThread {
                Toast.makeText(this, "Scan result: ${it.text}", Toast.LENGTH_LONG).show()
            }
        }
        codeScanner.errorCallback = ErrorCallback { // or ErrorCallback.SUPPRESS
            runOnUiThread {
                Toast.makeText(this, "Camera initialization error: ${it.message}",
                    Toast.LENGTH_LONG).show()
            }
        }

        scannerView.setOnClickListener {
            codeScanner.startPreview()
        }


        binding.ivBackProf.setOnClickListener {
            val gas = Intent(this, DashboardActivity::class.java)
            startActivity(gas)
        }

//        binding.btnScanQr.setOnClickListener {
//            val gas1 = Intent(this, AuthenticationActivity::class.java)
//            startActivity(gas1)
//            Toast.makeText(this, "Verify Your Code", Toast.LENGTH_SHORT).show()
//        }

        binding.tvbatasqr.setOnClickListener {
            val gas1 = Intent(this, AuthenticationActivity::class.java)
            startActivity(gas1)
            Toast.makeText(this, "Verify Your Code", Toast.LENGTH_SHORT).show()
        }

        val requestCamera=registerForActivityResult(ActivityResultContracts.RequestPermission(),{
            if(it)
            {
                Toast.makeText(applicationContext,"Permession Granted",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(applicationContext,"Permession Not Granted",Toast.LENGTH_SHORT).show()
            }
        })
        binding.btnScanQr.setOnClickListener(View.OnClickListener {
            requestCamera.launch(android.Manifest.permission.CAMERA)
        })
    }

    override fun onResume() {
        super.onResume()
        codeScanner.startPreview()
    }

    override fun onPause() {
        codeScanner.releaseResources()
        super.onPause()
    }


}