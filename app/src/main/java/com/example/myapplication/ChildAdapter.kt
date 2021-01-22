package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_rv_child.view.*

class ChildAdapter(
    private val list: ArrayList<Int>
):RecyclerView.Adapter<ChildAdapter.MyViewHolder>() {

    class MyViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rv_child, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.tvChild.text = "$position"
    }

    override fun getItemCount(): Int {
        return list.size
    }
}