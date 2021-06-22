package com.eddie.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var usernameDisplay: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)
        usernameDisplay = findViewById(R.id.usernameDisplay)

        usernameDisplay.text = "Eddie first App"
    }
}