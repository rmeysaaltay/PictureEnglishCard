package com.example.pictureenglishcards.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentViewHolder
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

    fun update(list: List<ClassData>) {
        itemList.clear()
        itemList.addAll(list)
        notifyDataSetChanged()
    }

    class InnerAdapter(
        private val onClick: (ClassData) -> Unit
    ) : RecyclerView.Adapter<InnerAdapter.ViewHolder>() {

        inner class ViewHolder(val binding: ItemviewBinding) :
            RecyclerView.ViewHolder(binding.root) {
            fun bind(item: ClassData) {
                binding.kelime.text = item.kelime
                itemView.setOnClickListener {
                    onClick.invoke(item)
                }
            }
        }

        private val itemList: ArrayList<ClassData> = arrayListOf()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val binding =
                ItemviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ViewHolder(binding)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = itemList[position]
            holder.bind(item)
        }

        override fun getItemCount(): Int = itemList.size

        fun update(list: List<ClassData>) {
            itemList.clear()
            itemList.addAll(list)
            notifyDataSetChanged()
        }
    }


}


