package chapter02.exceptions

fun errorneousCode () {
    val i = "1$".toInt()
}

fun main () {
    errorneousCode()
}