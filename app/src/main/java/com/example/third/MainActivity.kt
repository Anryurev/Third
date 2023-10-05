package com.example.third

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById<Button>(R.id.button)
        val inputtext1: EditText = findViewById<EditText>(R.id.editTextText)
        val inputtext2: EditText = findViewById<EditText>(R.id.editTextText2)
        val inputtext3: EditText = findViewById<EditText>(R.id.editTextText3)
        button.setOnClickListener {
            val string: String
            val char: String
            string = inputtext1.text.toString()
            char = inputtext2.text.toString()
            var result = 0
            for (i in string.indices){
                if (string[i] == char.toCharArray()[0]){
                    result = i + 1;
                }
            }
            inputtext3.setText(result.toString())
        }
    }
}