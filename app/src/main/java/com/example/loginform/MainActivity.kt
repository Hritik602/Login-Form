package com.example.loginform

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Getting User Name
        val userName=findViewById<EditText>(R.id.editTextTextEmailAddress)

        //getting UserPassword
        val userPassword=findViewById<EditText>(R.id.editTextTextPassword3)

        //Button To navigate
        val loginButton=findViewById<Button>(R.id.button)
         //On Clicked Function
        loginButton.setOnClickListener{


            if(userName.text.isEmpty()&&userPassword.text.isEmpty()){
                println("User Name and Password must not empty ")

            }

            else{

                val intent = Intent(this,Home::class.java)

                startActivity(intent)

            //            println(userName.text)
//
            //            println(userPassword.text)
            }

        }
    }

}