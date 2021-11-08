package com.example.applistviewandrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ClothesAdapter(private val clothesList: List<Clothes>) :
    RecyclerView.Adapter<ClothesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClothesViewHolder {
        val clothesItemView =
            LayoutInflater.from(parent.context).
            inflate(R.layout.clothes_list_item, parent, false)
        return ClothesViewHolder(clothesItemView)
    }

    override fun onBindViewHolder(holder: ClothesViewHolder, position: Int) {
        val clothes = clothesList[position]
        holder.bind(clothes)
    }

    override fun getItemCount(): Int {
        return clothesList.size
    }
}