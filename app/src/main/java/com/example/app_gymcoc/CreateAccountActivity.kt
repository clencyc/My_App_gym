package com.example.app_gymcoc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.google.firebase.auth.FirebaseAuth

class CreateAccountActivity : AppCompatActivity() {

    lateinit var Email_EDT: EditText
    lateinit var Password_EDT: EditText
    lateinit var Confirmpass_EDT: EditText
    lateinit var BTN_Signin: Button


    lateinit var auth:FirebaseAuth

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        auth = FirebaseAuth.getInstance()

        Email_EDT = findViewById(R.id.emailEt)
        Password_EDT = findViewById(R.id.passET)
        Confirmpass_EDT = findViewById(R.id.confirmPassEt)
        BTN_Signin = findViewById(R.id.btn_signup)

        auth = FirebaseAuth.getInstance()


        BTN_Signin.setOnClickListener {

            var email = Email_EDT.text.toString().trim()
            var pass = Password_EDT.text.toString().trim()
            var confirmpass = Confirmpass_EDT.text.toString().trim()

            //validate
            if (email.isNotEmpty() && pass.isNotEmpty() && confirmpass.isNotEmpty()) {
                 if (pass == confirmpass) {

                   auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                    if (it.isSuccessful) {
                       val intent = Intent(this, App_intro::class.java)
                     startActivity(intent)
                } else {
                  Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                }
                }
                } else {
                  Toast.makeText(this, "Password is not matching", Toast.LENGTH_SHORT).show()
                }
                } else {
                  Toast.makeText(this, "Empty Fields Are not Allowed !!", Toast.LENGTH_SHORT).show()

                 }
//}
        }
    }
}












//binding = ActivitySignUpBinding.inflate(layoutInflater)
//setContentView(binding.root)

//firebaseAuth = FirebaseAuth.getInstance()

//binding.button.setOnClickListener {
  //  val email = binding.emailEt.text.toString()
    //val pass = binding.passET.text.toString()
    //val confirmPass = binding.confirmPassEt.text.toString()

    //if (email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty()) {
       // if (pass == confirmPass) {

         //   firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
           //     if (it.isSuccessful) {
             //       val intent = Intent(this, App_intro::class.java)
               //     startActivity(intent)
                //} else {
                  //  Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                //}
            //}
        //} else {
          //  Toast.makeText(this, "Password is not matching", Toast.LENGTH_SHORT).show()
        //}
    //} else {
      //  Toast.makeText(this, "Empty Fields Are not Allowed !!", Toast.LENGTH_SHORT).show()

   // }
//}