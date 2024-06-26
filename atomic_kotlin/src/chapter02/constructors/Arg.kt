package chapter02.constructors

class Alien(name: String) {
    val greeting = "Poor $name!"
}

fun main() {
    val alien = Alien("Mr. Meeseeks")
    println(alien.greeting)
    // alien.name => 생성자 밖에서는 name에 접근할 수 없음.
}
