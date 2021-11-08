package com.example.applistviewandrecyclerview

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(city : String){
        val cityTextView: TextView = itemView.findViewById(R.id.city_text_view)
        cityTextView.text = city
        itemView.setOnClickListener{
            Toast.makeText(itemView.context, city, Toast.LENGTH_LONG).show()
        }
    }
}