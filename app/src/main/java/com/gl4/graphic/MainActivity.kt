package com.gl4.graphic

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var txtEmail: EditText
    lateinit var txtPassword : EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtEmail = findViewById(R.id.editTextEmail)
        txtPassword = findViewById(R.id.editPassword)

    }

    fun login(v: View?) {
        var email = txtEmail.text.toString()
        var password = txtEmail.text.toString()

        if( v?.id == R.id.btnLogin){
            if (email.equals("login")  && password.equals("login")){
                val toast = Toast.makeText(applicationContext, "Les données sont correctes", Toast.LENGTH_LONG)
                toast.show()
                intent.putExtra("email",email)
                startActivity(intent)
            }else{
                val toast = Toast.makeText(applicationContext, "Les données sont incorrectes", Toast.LENGTH_LONG)
                toast.show()

            }

        }
    }
    }
