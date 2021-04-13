package org.si.admingozero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val tombollogin = findViewById<TextView>(R.id.btnmasuk)
        tombollogin.setOnClickListener{
            startActivity(Intent(this@Login,MainActivity::class.java))
        }
    }
}