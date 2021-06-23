package com.eddie.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.eddie.todoapp.activities.HomeActivity


class MainActivity : AppCompatActivity() {
    val validUsername : String = "admin"
    val validPassword : String = "admin"

    //layout variables
    private lateinit var usernameInput : EditText
    private lateinit var passwordInput : EditText
    private lateinit var submitButton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        submitButton = findViewById(R.id.Submit_button)
        submitButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            login(username, password)
        }


    }
    fun login (username : String, password : String) {
    if (isValidCredentials(username, password)) {
        val intent : Intent = Intent(this, HomeActivity::class.java)
        intent.putExtra("username", username)
        startActivity(intent)
        }else{
            Toast.makeText(applicationContext, "Not Allowed", Toast.LENGTH_SHORT).show()
    }
    }
    private fun isValidCredentials (username: String, password: String): Boolean{
        return (password == validPassword)
    }

}