package com.example.applistviewandrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userNameList : List<String> = listOf("1", "2", "3", "4", "5", "6", "7")

        val carList : List<Car> = listOf(
            Car("Audi","red", 300),
            Car("BMW","black", 350),
            Car("Audi","red", 200)
        )
        val cityList : List<String> = listOf("Kazan","Novosibirsk", "Astana", "Kipr", "Minsk")

        val usersRecyclerView : RecyclerView = findViewById(R.id.users_recycle_view)
        usersRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //usersRecyclerView.adapter = UserAdapter(userNameList)
        usersRecyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        //usersRecyclerView.adapter = CarAdapter(carList)
        usersRecyclerView.adapter = CityAdapter(cityList)
    }
}