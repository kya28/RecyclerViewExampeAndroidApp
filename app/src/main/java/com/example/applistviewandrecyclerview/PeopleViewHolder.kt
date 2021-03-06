package com.example.applistviewandrecyclerview

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.applistviewandrecyclerview.People.*

class PeopleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val contactInfoTextView: TextView = itemView.findViewById(R.id.contact_info_text_view)
    @SuppressLint("SetTextI18n")
    private fun bindMan(man : People.Man){

        contactInfoTextView.text = "Номер телефона - ${man.phoneNumber}"

    }

    @SuppressLint("SetTextI18n")
    private fun bindWoman(woman : People.Women){
        contactInfoTextView.text = "Email - ${woman.email}"
    }

    fun bind(human : People.Human) {
        val nameTextView :TextView = itemView.findViewById(R.id.name_text_view)
        val ageTextView :TextView = itemView.findViewById(R.id.age_text_view)
        nameTextView.text = human.name
        ageTextView.text = human.age.toString()
        when (human) {
            is Man -> bindMan(human)
            is Women -> bindWoman(human)
        }

    }
}