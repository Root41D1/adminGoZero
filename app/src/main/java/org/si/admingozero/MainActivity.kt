package org.si.admingozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombolreportiut = findViewById(R.id.tomboliut) as ImageView
        tombolreportiut.setOnClickListener{
            startActivity(Intent(this@MainActivity,ReportIUT::class.java))
        }
    }
}