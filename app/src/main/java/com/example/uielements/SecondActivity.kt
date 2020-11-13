package com.example.uielements

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nextBtn2 = findViewById(R.id.nextBtn2) as Button
        val age = findViewById(R.id.ageSeekBar) as SeekBar
        val datePick = findViewById(R.id.datePicker) as DatePicker
        val pNumber = findViewById(R.id.phoneNumber) as EditText

        nextBtn2.setOnClickListener {
            // if(age.seekbar.trim().isNotEmpty() && lastName.text.trim().isNotEmpty() && emailAddress.text.trim().isNotEmpty()){
            val intent1 = Intent(this, ThirdActivity::class.java)
            //  intent.putExtra("FirstName", firstName)
            //intent.putExtra("LastName", lastName)
            //intent.putExtra("EmailAddress", emailAddress)
            startActivity(intent1)
            //}else{
            //Toast.makeText(this, "Please don't leave the fields empty!!!", Toast.LENGTH_LONG).show()

        }
    }
}