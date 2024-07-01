package chapter02.lists

import atomictest.eq

fun main() {
    val ints = listOf(99, 3, 5, 7, 11, 13)
    ints eq "[99, 3, 5, 7, 11, 13]"

    var result = ""
    for (i in ints) {
        result += "$i "
    }
    result eq "99 3 5 7 11 13"

    // List 원소를 인덱싱
    ints[4] eq 11

}