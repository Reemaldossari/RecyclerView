package com.reemsd.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reemsd.recyclerview.R
import com.reemsd.recyclerview.model.Category

class CategoryAdapter ( private val dataSet: List<Category>):
    RecyclerView.Adapter<CategoryAdapter.MyViewHolder>() {

    class MyViewHolder(view :View) : RecyclerView.ViewHolder(view) {
      val imageview: ImageView
      val textview :TextView

      init {
          imageview = view.findViewById(R.id.img_category)
          textview = view.findViewById(R.id.txt_category)
      }
    }

    //this is adapter bind xml
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_item, parent, false)

        return MyViewHolder(view)
    }

    //this is bind data with view or xml
    // Get element from your dataset at this position and replace the
    // contents of the view with that element

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textview.text = dataSet[position].name
        holder.imageview.setImageResource(dataSet[position].Image)
    }

    // this is count or number of item
    override fun getItemCount(): Int {
        return dataSet.size
    }


}
