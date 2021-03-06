package com.alorma.advent.day2

import org.junit.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class Day2SubmarineTest {
    private val submarine = Day2Submarine()

    @Test
    fun `result of depth 10 horizontal 15 is 150`() {
        val position = Day2Submarine.Position(depth = 10, horizontal = 15)

        expectThat(position.result()).isEqualTo(150)
    }

    @Test
    fun `test data should return 10 depth 15 horizontal`() {
        val result = submarine.calculate(Day2Data.testItems)

        expectThat(result) {
            get { depth }.isEqualTo(10)
            get { horizontal }.isEqualTo(15)
            get { result.result() }.isEqualTo(150)
        }
    }

    @Test
    fun `advent data should return 927 depth 1850 horizontal`() {
        val result = submarine.calculate(Day2Data.adventItems)

        expectThat(result) {
            get { depth }.isEqualTo(927)
            get { horizontal }.isEqualTo(1850)
            get { result.result() }.isEqualTo(1714950)
        }
    }

    @Test
    fun `test data with aim should return 60 depth 15 horizontal`() {
        val result = submarine.calculateWithAim(Day2Data.testItems)

        expectThat(result) {
            get { depth }.isEqualTo(60)
            get { horizontal }.isEqualTo(15)
            get { result.result() }.isEqualTo(900)
        }
    }

    @Test
    fun `advent data with aim should return 692961 depth 1850 horizontal`() {
        val result = submarine.calculateWithAim(Day2Data.adventItems)

        expectThat(result) {
            get { depth }.isEqualTo(692961)
            get { horizontal }.isEqualTo(1850)
            get { result.result() }.isEqualTo(1281977850)
        }
    }
}