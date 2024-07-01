package chapter02.exceptions

import atomictest.capture

fun main() {
    capture {
        "1$".toInt()
    } eq "NumberFormatException: " +
            """For input string: "1$""""
}