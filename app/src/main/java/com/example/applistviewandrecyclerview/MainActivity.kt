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
        val bannerList : List<Banner> = listOf(
            Banner(R.drawable.banner_image, "1"),
            Banner(R.drawable.banner_image, "2"),
            Banner(R.drawable.banner_image, "3")
        )

        val peopleList : List<People.Human> = listOf(
            People.Man("asas",14, "12354548"),
            People.Women("fkfkfk", 44, "ueueue@mdmd"),
            People.Man("asas",14, "12354548"),
            People.Women("fkfkfk", 44, "ueueue@mdmd"),
            People.Man("asas",14, "12354548"),
            People.Women("fkfkfk", 44, "ueueue@mdmd")
        )

        val clothesList : List<Clothes> = listOf(
            Clothes(42, "t-shirt", "red"),
            Clothes(46, "skirt", "blue"),
            Clothes(41, "socks", "yellow"),
            Clothes(36, "jeans", "orange"),
        )

        val usersRecyclerView : RecyclerView = findViewById(R.id.users_recycle_view)
        usersRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //usersRecyclerView.adapter = UserAdapter(userNameList)
        usersRecyclerView.addItemDecoration(DividerItemDecoration
            (this, DividerItemDecoration.VERTICAL))
        //usersRecyclerView.adapter = CarAdapter(carList)
        //usersRecyclerView.adapter = CityAdapter(cityList)
        //usersRecyclerView.adapter = BannerAdapter(bannerList)
        usersRecyclerView.adapter = ClothesAdapter(clothesList)
    }
}