package com.example.app_gymcoc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {

    lateinit var EmailEDT_signin:EditText
    lateinit var PassEDT_signin:EditText
    lateinit var BTN_SIGNIN:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        EmailEDT_signin = findViewById(R.id.email_signin)
        PassEDT_signin = findViewById(R.id.pass_signin)
        BTN_SIGNIN = findViewById(R.id.btn_signin)


        BTN_SIGNIN.setOnClickListener {
            var email1 = EmailEDT_signin.text.toString().trim()
            var pass1 = PassEDT_signin.text.toString().trim()

            if (email1.isEmpty() || pass1.isEmpty()){
                Toast.makeText(this, "Cannot submit empty field", Toast.LENGTH_SHORT).show()

            }else{

                var gotomain1 = Intent (this, MainActivity::class.java)
                startActivity(gotomain1)
            }
        }

    }
}