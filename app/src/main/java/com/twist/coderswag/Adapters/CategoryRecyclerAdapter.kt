package com.twist.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.twist.coderswag.Model.Category
import com.twist.coderswag.R

class CategoryRecyclerAdapter(val context: Context, val categories: List<Category>) :
    RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.category_list_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position], context)
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val categoryImage: ImageView? = itemView?.findViewById(R.id.categoryImage)
        val categoryName: TextView? = itemView?.findViewById(R.id.categoryName)

        fun bindCategory(category: Category, context: Context) {
            val resourceId =
                context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
        }
    }

}