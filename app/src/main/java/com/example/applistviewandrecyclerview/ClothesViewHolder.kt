package com.example.applistviewandrecyclerview

import android.annotation.SuppressLint
import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.switchmaterial.SwitchMaterial


class ClothesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    fun bind(clothes: Clothes){
        val sizeTextView: TextView = itemView.findViewById(R.id.size_text_view)
        val typeTextView: TextView = itemView.findViewById(R.id.type_text_view)
        val colorTextView: TextView = itemView.findViewById(R.id.color_text_view)
        sizeTextView.text = clothes.size.toString()
        typeTextView.text = clothes.type
        colorTextView.text = clothes.color

        val switchMaterial : SwitchMaterial = itemView.findViewById(R.id.switch_material)
        switchMaterial.setOnClickListener {
            println("Switch checked")
        }

    }
}