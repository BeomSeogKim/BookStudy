package chapter02.lists

import atomictest.eq

fun main() {
    val doubles = listOf(1.1, 2.2, 3.3, 4.4)
    doubles.sum() eq 11.0

    val strings = listOf("Twas", "Brilling", "And", "Slithy", "Toves")
    strings eq listOf("Twas", "Brilling", "And", "Slithy", "Toves")
    strings.sorted() eq listOf("And", "Brilling", "Slithy", "Toves", "Twas")
    strings.reversed() eq listOf("Toves", "Slithy", "And", "Brilling", "Twas")
    strings.first() eq "Twas"
    strings.takeLast(2) eq listOf("Slithy", "Toves")
}