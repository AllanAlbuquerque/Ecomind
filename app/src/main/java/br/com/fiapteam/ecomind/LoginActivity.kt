package br.com.fiapteam.ecomind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnCreate = findViewById<TextView>(R.id.login_textView_register)
        val btnSignUp = findViewById<Button>(R.id.login_button_signUp)

        btnCreate.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        btnSignUp.setOnClickListener {
            val intent = Intent(this, Source::class.java)
            startActivity(intent)
        }
    }
}