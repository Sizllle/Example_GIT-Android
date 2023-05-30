package com.example.example_git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.example_git.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(Sizlle: Bundle?) {
        super.onCreate(Sizlle)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun onClickButtonChange (view: View){
        binding.tvMain.text = "We change text"
    }
}