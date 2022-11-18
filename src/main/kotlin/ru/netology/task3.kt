package ru.netology

fun main() {
    val amountOfMoney: Int = 2000
    val minSale: Int = 100
    val maxSale: Int = 5
    val regularsale: Int = 1
    val isRegularCustomer = true
    val sale: Int = if (1000 < amountOfMoney && amountOfMoney < 10001 && !isRegularCustomer) {minSale}
    else if (1000 < amountOfMoney && amountOfMoney < 10001 && isRegularCustomer) {minSale + amountOfMoney / 100 * regularsale}
    else if (amountOfMoney > 10_000 && !isRegularCustomer) {amountOfMoney / 100 * maxSale}
    else if (amountOfMoney > 10_000 && isRegularCustomer) {amountOfMoney / 100 * maxSale + amountOfMoney / 100 * regularsale}
    else 0
    println(sale)
}