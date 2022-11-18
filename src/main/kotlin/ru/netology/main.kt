package ru.netology

fun main() {
    val amount: Int = 348945
    val commissionPerSent: Double = 0.75
    val commissionMin: Int = 35
    val commission: Double = amount * commissionPerSent / 100
    val result: Double = if (commission > commissionMin) commission else commissionMin.toDouble()
    println(result.toInt())
}