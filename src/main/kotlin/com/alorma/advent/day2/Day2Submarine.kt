package com.alorma.advent.day2

import java.lang.Integer.max

class Day2Submarine {

    fun calculate(input: List<String>): Position {
        var depth = 0
        var horizontal = 0

        val commands: List<Pair<String, Int>> = input.map { command ->
            val commandParts = command.split(" ")
            commandParts[0] to commandParts[1].toInt()
        }

        commands.forEach { (command, value) ->
            if (command == "forward") {
                horizontal += value
            } else if (command == "up") {
                depth -= value
                depth = max(0, depth)
            } else if (command == "down") {
                depth += value
                depth = max(0, depth)
            } else {
                throw IllegalStateException("invalid command")
            }
        }

        return Position(depth = depth, horizontal = horizontal)
    }

    fun calculateWithAim(input: List<String>): Position {
        var depth = 0
        var horizontal = 0
        var aim = 0

        val commands: List<Pair<String, Int>> = input.map { command ->
            val commandParts = command.split(" ")
            commandParts[0] to commandParts[1].toInt()
        }

        commands.forEach { (command, value) ->
            if (command == "forward") {
                horizontal += value
                depth += aim * value
            } else if (command == "up") {
                aim -= value
            } else if (command == "down") {
                aim += value
            } else {
                throw IllegalStateException("invalid command")
            }
        }

        return Position(depth = depth, horizontal = horizontal)
    }

    data class Position(val depth: Int, val horizontal: Int) {
        fun result() = depth * horizontal
    }

}