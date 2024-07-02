package chapter02.lists

import atomictest.eq

fun getList(): List<Int> = mutableListOf(1, 2, 3)

fun main() {
    // getList()는 읽기 전용 list를 생성함.
    val list = getList()
//    list += 4 // error
    list eq listOf(1, 2, 3)

}