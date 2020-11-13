package com.example.uielements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val intent = getIntent()
        val firstName = intent.getStringExtra("FirstName")
        val lastName = intent.getStringExtra("LastName")
        val emailAddress = intent.getStringExtra("EmailAddress")
        val resultTv = findViewById(R.id.resultTv) as TextView

        resultTv.text = "Collected info: \n\nFirst Name: " + firstName + "\nLastName: " + lastName + "\nEmailAddress: " + emailAddress
    }
}