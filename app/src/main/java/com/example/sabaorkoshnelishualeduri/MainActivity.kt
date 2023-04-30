package com.example.sabaorkoshnelishualeduri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview_name: TextView = findViewById(R.id.textview_name)
        val editText_name: EditText = findViewById(R.id.editText_name)

        val btn_okay: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_okay)
        val btn_next: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_next)
        btn_okay.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                textview_name.setText("Hello, " + editText_name.text)
            }
        })

        btn_next.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            }
        })
    }
}