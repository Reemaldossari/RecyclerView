package com.reemsd.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.reemsd.recyclerview.adapter.CategoryAdapter
import com.reemsd.recyclerview.databinding.ActivityMainBinding
import com.reemsd.recyclerview.model.Category

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rvHome.layoutManager = GridLayoutManager(this, 2)

        val dataSet =ArrayList<Category>()

        dataSet.add(Category(R.drawable.man,"trip"))
        dataSet.add(Category(R.drawable.man,"trip"))
        dataSet.add(Category(R.drawable.man,"trip"))
        dataSet.add(Category(R.drawable.man,"trip"))
        dataSet.add(Category(R.drawable.man,"trip"))

        val adapter = CategoryAdapter(dataSet)

        binding.rvHome.adapter = adapter



    }
}