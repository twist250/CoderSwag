package com.twist.coderswag.Controller

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.twist.coderswag.Adapters.CategoryAdapter
import com.twist.coderswag.Model.Category
import com.twist.coderswag.R
import com.twist.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
        categoryListView.setOnItemClickListener { parent, view, position, id ->
            val category: Category = DataService.categories[position]
            Toast.makeText(this,"You clicked on ${category.title}",Toast.LENGTH_SHORT).show()
        }
    }
}
