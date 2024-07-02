package chapter02.lists

import atomictest.eq

// 반환 타입을 추론
fun inferred(p: Char, q: Char) = listOf(p, q)

// 반환 타입을 명시
fun explicit(p: Char, q: Char): List<Char> = listOf(p, q)

fun main() {
    inferred('a', 'b') eq "[a, b]"
    explicit('y', 'z') eq "[y, z]"
}