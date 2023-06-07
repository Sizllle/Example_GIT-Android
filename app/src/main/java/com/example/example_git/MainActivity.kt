package com.example.example_git

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.example_git.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val REQUEST_CODE = 123 // Уникальный код для идентификации запроса
    override fun onCreate(Sizlle: Bundle?) {
        super.onCreate(Sizlle)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    // Функция передачи данных на другую Activity
    fun onClickButtonSend (view: View){
        val inputText = binding.etFirst.text.toString()
        // Создаём намерение для запуска второй активности
        val intent = Intent(this, MainActivity2::class.java)
        // Передаем данные через намерение
        intent.putExtra("inputTextKey", inputText)
        startActivity(intent)
    }

    // Функция перехода на другую Activity
    fun onClickButtonGo (view: View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
    fun onClickButtonChange (view: View){
        binding.tvMain.text = "We change text"
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            val outputText = data?.getStringExtra("outputText")
            // Здесь вы можете использовать полученное значение outputText и выполнить необходимые действия
        }
    }
}