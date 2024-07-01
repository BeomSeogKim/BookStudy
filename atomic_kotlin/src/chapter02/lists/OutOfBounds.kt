package chapter02.lists

import atomictest.capture

fun main() {
    val ints = listOf(1, 2, 3)
    capture {
        ints[3]
    } contains
        listOf("ArrayIndexOutOfBoundsException")

}