package com.example.loginform

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.app.NotificationCompat
import android.support.v4.app.NotificationManagerCompat
import android.widget.Button


class Home : AppCompatActivity() {

    lateinit  var notificationChannel : NotificationChannel
    private val notificationChannelId ="notification id"
    lateinit var builder : NotificationCompat.Builder
    override fun onCreate(savedInstanceState: Bundle?) {




        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        // Showing button
        val clickedButton=findViewById<Button>(R.id.button2)

        createNotificationChannel()

        //Button Function
        clickedButton.setOnClickListener{
            println("Clicked")
            notificationFunction()
        }
    }

    private fun createNotificationChannel(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name="hello"
            val descriptionText="Hritik"
            val importance=NotificationManager.IMPORTANCE_HIGH
            val channel:NotificationChannel= NotificationChannel(notificationChannelId,name,importance).apply {
                description=descriptionText
            }
            val notificationManager:NotificationManager= getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)

        }

    }
    private fun notificationFunction(){

        val intent= Intent(this, Home::class.java).apply {
            flags=Intent.FLAG_ACTIVITY_NEW_TASK
        }
         var pendingIntent:PendingIntent= PendingIntent.getActivity(this,0,intent,0)

        val builder:NotificationCompat.Builder=NotificationCompat.Builder(this,notificationChannelId)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle("Hello")
            .setContentText("Hritik How Are You")
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
        with(NotificationManagerCompat.from(this)){
                notify(101,builder.build())
        }
    }
}

