package com.example.palindrome

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//No ON Create é onde eu faço praticamente todos os finds
class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var resultText: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        editText = findViewById(R.id.editTextText)
        resultText = findViewById(R.id.textViewResult)


    }

    fun verifyPalindrome(view: View) {

        //findViewById<Button>(R.id.button).setOnClickListener {  ->
         //   verifyPalindrome(it)
        val word = editText.text.toString()

        if (word.lowercase() == word.lowercase().reversed()) {
            resultText.text = "$word é um palíndromo!"
        } else {
            resultText.text = "A palavra '$word' não é um palíndromo!"
        }
    }

}