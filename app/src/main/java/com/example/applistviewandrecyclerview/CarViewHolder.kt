package com.example.applistviewandrecyclerview

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(car: Car){
        val brandTextView: TextView = itemView.findViewById(R.id.brand_text_view)
        val colorTextView: TextView = itemView.findViewById(R.id.color_text_view)
        val maxSpeedTextView: TextView = itemView.findViewById(R.id.max_speed_text_view)
        brandTextView.text = car.brand
        colorTextView.text = car.color
        maxSpeedTextView.text = car.maxSpeed.toString()

    }
}