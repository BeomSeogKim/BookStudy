package chapter02.lists

import atomictest.eq

fun main() {
    // 'val' / 'var' 에 가변 리스트를 대입하는 경우
    val list1 = mutableListOf('A')  // or 'var'
    list1 += 'A'
    list1.plusAssign('A')

    // 'val'에 불변 리스트를 대입하는 경우
    val list2 = listOf('B')
//    list2 += 'B'  // 다음줄과 같음
    // list2 = list2 + 'B'

    // 'var'에 불변 리스트를 대입하는 경우
    var list3 = listOf('C')
    list3 += 'C'
    val newList = list3 + 'C'
    list3 = newList

    list1 eq "[A, A, A]"
    list2 eq "[B]"
    list3 eq "[C, C, C]"
}