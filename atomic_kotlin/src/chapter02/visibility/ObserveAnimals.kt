package chapter02.visibility

fun main() {
    /*
     * 다른 파일에 정의한 private 멤버에 접근할 수 없다.
     * val rabbit = Animal("Rabbit")
     * 함수도 마찬가지
     * recordAnimal(rabbit)
     */
    recordAnimals()
    recordAnimalsCount()
}