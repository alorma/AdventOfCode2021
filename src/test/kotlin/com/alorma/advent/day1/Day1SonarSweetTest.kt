package com.alorma.advent.day1

import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Day1SonarSweetTest {

    private val calculator = Day1SonarSweet()

    @Test
    fun `should return 2 calculatedSimple when items are 101 102 103 99`() {
        val result = calculator.calculateSimple(listOf(101, 102, 103, 99))

        expectThat(result).isEqualTo(2)
    }

    @Test
    fun `should return 3 calculatedSimple when items are 101 102 99 103 104`() {
        val result = calculator.calculateSimple(listOf(101, 102, 99, 103, 104))

        expectThat(result).isEqualTo(3)
    }

    @Test
    fun `should return 1557 calculatedSimple when items are Day1Data adventItems`() {
        val result = calculator.calculateSimple(Day1Data.adventItems)

        expectThat(result).isEqualTo(1557)
    }
}

