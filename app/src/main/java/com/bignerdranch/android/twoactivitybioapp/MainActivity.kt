package com.bignerdranch.android.twoactivitybioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class
MainActivity : AppCompatActivity() {
    lateinit var first: EditText
    lateinit var last: EditText
    lateinit var school: EditText
    lateinit var grad: EditText
    lateinit var degree: EditText
    lateinit var major: EditText
    lateinit var activity: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        first = findViewById(R.id.firstName)
        last = findViewById(R.id.lastName)
        school = findViewById(R.id.school)
        grad = findViewById(R.id.Grad)
        degree = findViewById(R.id.degree)
        major = findViewById(R.id.major)
        activity = findViewById(R.id.activies)

        val buttonClick = findViewById<Button>(R.id.CreateButton)
        buttonClick.setOnClickListener {
            val i = Intent(this, BioText::class.java)
            val intent = Intent(this, BioText::class.java).apply {

                putExtra("Data1",first.text.toString())
                putExtra("Data2",last.text.toString())
                putExtra("Data3",school.text.toString())
                putExtra("Data4",grad.text.toString())
                putExtra("Data5",degree.text.toString())
                putExtra("Data6",major.text.toString())
                putExtra("Data7",activity.text.toString())
            }
            startActivity(intent)
        }
    }
}

