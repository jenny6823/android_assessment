package com.jennifer.myapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jennifer.myapp.databinding.MyappListBinding

class MyappAdapter
    (private val myappData: List<myappData>) : RecyclerView.Adapter<MyappAdapter.MyappViewHolder>() {

    inner class MyappViewHolder(val binding: MyappListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun setData(myappItem: myappData) {
            binding.imageProfile.setImageResource(myappItem.pic)
            binding.firstName.text = myappItem.first
            binding.lastName.text = myappItem.last
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyappViewHolder {
        val binding: MyappListBinding =
            MyappListBinding.inflate(LayoutInflater.from(parent.context))
        return MyappViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyappViewHolder, position: Int) {
        val myappItem = myappData[position]
        holder.setData(myappItem)

    }

    override fun getItemCount(): Int {
        return myappData.size
    }
}