package com.bignerdranch.android.twoactivitybioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BioText : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bio_text)
        val first = intent.getStringExtra("Data1")
        val last = intent.getStringExtra("Data2")
        val school = intent.getStringExtra("Data3")
        val grad = intent.getStringExtra("Data4")
        val degree = intent.getStringExtra("Data5")
        val major = intent.getStringExtra("Data6")
        val activity = intent.getStringExtra("Data7")


        findViewById<TextView>(R.id.MainBioText).apply{
            text = first.toString() + last.toString()+ " graduated in " + grad.toString() + " with a " + degree.toString() +
                    " with a concentration in " + major.toString() + " from " + school.toString()+
                    ". Their favorite activities are " + activity.toString()
        }

    }
}