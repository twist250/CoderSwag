package com.twist.coderswag.Controller

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.twist.coderswag.Adapters.ProductsAdapter
import com.twist.coderswag.R
import com.twist.coderswag.Services.DataService
import com.twist.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE)
            spanCount = 4
        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720)
            spanCount = 3

        val layoutManager = GridLayoutManager(this, spanCount)
        productsListView.adapter = adapter
        productsListView.layoutManager = layoutManager
    }
}
