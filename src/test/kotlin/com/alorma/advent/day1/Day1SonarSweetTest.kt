package com.alorma.advent.day1

import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Day1SonarSweetTest {

    private val calculator = Day1SonarSweet()

    @Test
    fun `should return 2 when items are 101 102 103 99`() {
        val result = calculator.calculate(listOf(101, 102, 103, 99))

        expectThat(result).isEqualTo(2)
    }

    @Test
    fun `should return 3 when items are 101 102 99 103 104`() {
        val result = calculator.calculate(listOf(101, 102, 99, 103, 104))

        expectThat(result).isEqualTo(3)
    }
}

