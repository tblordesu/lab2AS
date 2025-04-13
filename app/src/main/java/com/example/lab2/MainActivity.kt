package com.example.lab2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Инициализация кнопок
        val btnEmployees = findViewById<Button>(R.id.btnEmployees)
        val btnAboutFactory = findViewById<Button>(R.id.btnAboutFactory)

        // Обработчик кнопки для списка работников
        btnEmployees.setOnClickListener {
            // Переход к экрану списка работников
            val intent = Intent(this, EmployeeListActivity::class.java)
            startActivity(intent)
        }

        // Обработчик кнопки для информации о фабрике
        btnAboutFactory.setOnClickListener {
            // Переход к экрану с информацией о фабрике
            val intent = Intent(this, AboutFactoryActivity::class.java)
            startActivity(intent)
        }
    }
}
