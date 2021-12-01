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

    @Test
    fun `should return 2 calculatedGrouped when items are 199 200 208 210 200 207 240 269 260 263`() {
        val result = calculator.calculateGrouped(listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263))

        expectThat(result).isEqualTo(5)
    }
    @Test
    fun `should return 1608 calculatedGrouped when items are Day1Data adventItems`() {
        val result = calculator.calculateGrouped(Day1Data.adventItems)

        expectThat(result).isEqualTo(1608)
    }
}
