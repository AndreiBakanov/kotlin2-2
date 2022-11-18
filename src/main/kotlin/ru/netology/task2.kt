package ru.netology

fun main() {
    val peopleText1: String = "людям"
    val peopleText2: String = "человеку"
    val amountOfLikes: Int = 111
    val correctVar: String = if (amountOfLikes % 10 === 1  && amountOfLikes / 10 % 10 != 1) peopleText2 else peopleText1
    println("Понравилось $amountOfLikes $correctVar")
}