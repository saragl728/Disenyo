package com.example.disenyo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.disenyo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)   //se pone el binding
        setContentView(binding.root)

        binding.bLogin.setOnClickListener {
            Toast.makeText(this, binding.email.text, Toast.LENGTH_LONG).show()
            Log.d("Email", binding.email.text.toString())
        }

    }

}