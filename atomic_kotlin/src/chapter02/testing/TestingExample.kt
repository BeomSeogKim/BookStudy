package chapter02.testing

import atomictest.*;

fun main() {
    val v1 = 11
    val v2 = "Ontology"
    // eq : 같다는 뜻
    v1 eq 11
    v2 eq "Ontology"

    // neq : 같지 않다는 뜻
    v2 neq "Epistimology"
}