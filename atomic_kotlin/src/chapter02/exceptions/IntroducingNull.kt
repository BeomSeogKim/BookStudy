package chapter02.exceptions

import atomictest.eq

fun main() {
    "1$".toIntOrNull() eq null
}