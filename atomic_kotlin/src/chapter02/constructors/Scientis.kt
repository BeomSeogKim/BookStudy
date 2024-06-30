package chapter02.constructors

class Scientist(val name: String) {
    override fun toString(): String {
        return "Scientist('$name')"
    }
}

fun main () {
    val zeep = Scientist("Zeep Xanflorp")
    println(zeep)
}