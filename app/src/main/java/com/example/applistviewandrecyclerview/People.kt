package com.example.applistviewandrecyclerview

sealed interface People{

    open class Human(
        open val name: String,
        open val age: Int
    )

    data class Man(
        override val name : String,
        override val age: Int,
        val phoneNumber: String
    ):Human(name, age)

    data class Women(
        override val name : String,
        override val age: Int,
        val email: String
    ):Human(name, age)
}
