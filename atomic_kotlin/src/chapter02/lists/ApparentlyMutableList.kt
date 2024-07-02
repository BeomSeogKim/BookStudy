package chapter02.lists

import atomictest.eq

fun main() {
    var list = listOf('X')  // 불변 리스트
    list += 'Y'             // 가변 리스트처럼 보임
    list eq "[X, Y]"
}