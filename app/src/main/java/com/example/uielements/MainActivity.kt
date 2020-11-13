package com.example.uielements

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextBtn = findViewById(R.id.nextBtn) as Button
        val firstName = findViewById(R.id.firstName) as EditText
        val lastName = findViewById(R.id.lastName) as EditText
        val emailAddress = findViewById(R.id.emailAddress) as EditText

        nextBtn.setOnClickListener{
            val firstName = firstName.text.toString()
            val lastName = lastName.text.toString()
            val emailAddress = emailAddress.text.toString()

            if(firstName.trim().isNotEmpty() && lastName.trim().isNotEmpty() && emailAddress.trim().isNotEmpty()){
                val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("FirstName", firstName)
                    intent.putExtra("LastName", lastName)
                    intent.putExtra("EmailAddress", emailAddress)
                    startActivity(intent)
            }else{
                Toast.makeText(this, "Please don't leave the fields empty!!!", Toast.LENGTH_LONG).show()
            }
        }
    }

}



