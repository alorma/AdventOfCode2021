package com.alorma.advent.day1

class Day1SonarSweet {

    fun calculateSimple(items: List<Int>): Int {
        var previous = items.first()
        var count = 0

        items.drop(1).forEach { item ->
            if (item > previous) {
                count++
            }
            previous = item
        }

        return count
    }

}

fun main() {
    val calculator = Day1SonarSweet()
    val result = calculator.calculateSimple(Day1Data.adventItems)
    println(result)
}