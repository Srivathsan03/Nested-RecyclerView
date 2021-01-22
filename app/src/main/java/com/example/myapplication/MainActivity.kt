package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<String>()

        rvParent.layoutManager = LinearLayoutManager(applicationContext)
        rvParent.adapter = ParentAdapter(list)

        list.add("a")
        list.add("b")
        list.add("c")
        list.add("d")
        list.add("e")
        list.add("f")
        list.add("g")

        rvParent.adapter?.notifyDataSetChanged()
    }
}