package chapter02.visibility

class Cookie(
    private var isReady: Boolean
) {

    private fun crumble() =
        println("crumble")

    private fun bite() =
        println("bite")

    fun eat() {
        isReady = true
        crumble()
        bite()
    }
}


fun main() {
    val x = Cookie(false)
//    x.bite()  // private 메서드 실행 불가.
    x.eat()
}