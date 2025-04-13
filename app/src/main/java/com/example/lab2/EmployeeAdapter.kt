package com.example.lab2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter(
    private val employees: List<Employee>,
    private val onClick: (Employee) -> Unit
) : RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder>() {

    class EmployeeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageEmployee)
        val nameView: TextView = view.findViewById(R.id.textName)
        val positionView: TextView = view.findViewById(R.id.textPosition)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_employee, parent, false)
        return EmployeeViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val employee = employees[position]
        holder.nameView.text = employee.name
        holder.positionView.text = employee.position
        holder.imageView.setImageResource(employee.imageResId)

        holder.itemView.setOnClickListener {
            onClick(employee)
        }
    }

    override fun getItemCount(): Int = employees.size
}
