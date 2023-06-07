package com.example.example_git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.example_git.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(Sizlle: Bundle?) {
        super.onCreate(Sizlle)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val receivedData = intent.getStringExtra("inputTextKey")
        binding.tvReceivedText.text = receivedData
    }

    fun onClickButtonBack(){
        finish()
    }
}