package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_rv_parent.view.*

class ParentAdapter(
    private val list:ArrayList<String>
) : RecyclerView.Adapter<ParentAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rv_parent, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.tvName.text = "$position"

        val list = ArrayList<Int>()

        holder.itemView.rvChild.layoutManager = LinearLayoutManager(holder.itemView.context)
        holder.itemView.rvChild.adapter = ChildAdapter(list)

        list.add(1)
        list.add(1)
        list.add(1)
        list.add(1)
        list.add(1)
        list.add(1)
        list.add(1)
        list.add(1)
        list.add(1)
        holder.itemView.rvChild.adapter?.notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}