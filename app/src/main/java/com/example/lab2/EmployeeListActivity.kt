package com.example.lab2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent
import com.example.lab2.Employee
import com.example.lab2.EmployeeAdapter

class EmployeeListActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: EmployeeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_list)

        recyclerView = findViewById(R.id.recyclerViewEmployees)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val employees = listOf(
            Employee("Иванов Иван", "Слесарь", R.drawable.ivanov, "Мужской", 35, 10),
            Employee("Петров Петр", "Токарь", R.drawable.petrov, "Мужской", 42, 15),
            Employee("Сидоров Алексей", "Электрик", R.drawable.sidorov, "Мужской", 28, 5)
        )

        adapter = EmployeeAdapter(employees) { employee: Employee ->
            val intent = Intent(this, EmployeeDetailsActivity::class.java).apply {
                putExtra("name", employee.name)
                putExtra("position", employee.position)
                putExtra("imageResId", employee.imageResId)
                putExtra("gender", employee.gender)
                putExtra("age", employee.age)
                putExtra("experience", employee.experience)
            }
            startActivity(intent)
        }

        recyclerView.adapter = adapter
    }
}
