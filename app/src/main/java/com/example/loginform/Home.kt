package com.example.loginform

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Showing button
        val clickedButton=findViewById<Button>(R.id.button)



        //Button Function
        clickedButton.setOnClickListener{
            println("Clicked")
        }


    }
}