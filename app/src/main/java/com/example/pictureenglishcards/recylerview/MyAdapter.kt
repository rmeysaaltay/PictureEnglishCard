package com.example.pictureenglishcards.recylerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pictureenglishcards.R
import com.example.pictureenglishcards.classData
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val newList: ArrayList<classData>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    //private var _binding: MyA? = null
    //private val binding get() = _binding!!


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.listitem, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


        val currentItem = newList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.kelime.text = currentItem.kelime
        holder.kelimeAnlami.text = currentItem.kelimeAnlami
        holder.cumle.text = currentItem.cumle
    }

    override fun getItemCount(): Int {
        return newList.size
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleImage: ShapeableImageView = itemView.findViewById(R.id.title_image)
        var kelime: TextView = itemView.findViewById(R.id.kelime)
        var kelimeAnlami: TextView = itemView.findViewById(R.id.kelimeAnlami)
        var cumle: TextView = itemView.findViewById(R.id.cumle)


    }

}