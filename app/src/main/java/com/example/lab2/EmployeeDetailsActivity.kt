package com.example.lab2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import androidx.appcompat.app.AppCompatActivity

class EmployeeDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_details)

        val name = intent.getStringExtra("name")
        val position = intent.getStringExtra("position")
        val imageResId = intent.getIntExtra("imageResId", R.drawable.placeholder)
        val gender = intent.getStringExtra("gender")
        val age = intent.getIntExtra("age", 0)
        val experience = intent.getIntExtra("experience", 0)

        val imageView = findViewById<ImageView>(R.id.imageEmployee)
        val textName = findViewById<TextView>(R.id.textName)
        val textPosition = findViewById<TextView>(R.id.textPosition)
        val buttonBack = findViewById<MaterialButton>(R.id.buttonBack)

        val textGender = findViewById<TextView>(R.id.textGender)
        val textAge = findViewById<TextView>(R.id.textAge)
        val textExperience = findViewById<TextView>(R.id.textExperience)

        textName.text = name
        textPosition.text = position
        imageView.setImageResource(imageResId)
        textGender.text = "Пол: $gender"
        textAge.text = "Возраст: $age лет"
        textExperience.text = "Стаж: $experience лет"

        buttonBack.setOnClickListener {
            finish() // Закрывает текущую Activity и возвращает к списку
        }
    }
}
