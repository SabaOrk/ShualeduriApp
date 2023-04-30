package com.example.sabaorkoshnelishualeduri

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textView_Count: TextView = findViewById(R.id.textView_Count)

        val btn_add_count: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.count_increment)

        btn_add_count.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val num1: Int = Integer.valueOf(textView_Count.text.toString())
                textView_Count.setText(num1 + 1)
            }
        })
    }
}