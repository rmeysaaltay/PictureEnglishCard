package com.example.pictureenglishcards.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView
import com.example.pictureenglishcards.R
import com.example.pictureenglishcards.databinding.ItemviewBinding
import com.example.pictureenglishcards.model.ClassData


class MyAdapter(private val itemList: ArrayList<ClassData>) :
    RecyclerView.Adapter<MyAdapter.ItemViewHolder>() {

    // ViewHolder class using ViewBinding
    inner class ItemViewHolder(private val binding: ItemviewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ClassData) {
            binding.kelime.text = item.kelime
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // Inflate layout using ViewBinding
        val binding = ItemviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // Bind each item
        val currentItem = itemList[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
    fun update(list:List<ClassData>){
        itemList.clear()
        itemList.addAll(list)
        notifyDataSetChanged()
    }
}
