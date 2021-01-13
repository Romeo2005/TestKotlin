package org.romeo.testkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(
                    this,
                    (findViewById<View>(R.id.text) as EditText).text.toString(),
                    Toast.LENGTH_LONG).show()
        }
    }
}