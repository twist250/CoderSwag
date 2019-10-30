package com.twist.coderswag.Controller

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.twist.coderswag.Model.Category
import com.twist.coderswag.R
import com.twist.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            DataService.categories
        )
        categoryListView.adapter = adapter
    }
}
