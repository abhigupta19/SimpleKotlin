package com.sar.user.firstkotlin

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button=findViewById<Button>(R.id.button);
        val text=findViewById<EditText>(R.id.editText);
        val ftext=findViewById<TextView>(R.id.textView);
        button.setOnClickListener {ftext.setText(text.text.toString()) }
    }
}
