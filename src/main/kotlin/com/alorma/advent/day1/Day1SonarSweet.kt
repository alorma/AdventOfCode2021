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

    fun calculateGrouped(items: List<Int>): Int {
        val sums = items.windowed(3, 1) { window -> window.sum() }
        return calculateSimple(sums)
    }
}