package chapter12.code1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class AddUseCaseTestMultipleCase {

    lateinit var addUseCase: AddUseCase

    // 인스턴스화 하는 부분의 반복을 @BeforeEach 어노테이션을 활용해 반복 줄이기.
    @BeforeEach
    fun setUp() {
        addUseCase = AddUseCase()
    }

    @Test
    fun `1 더하기 2는 3이다`() {
        val result = addUseCase.add(1, 2)
        assertEquals(3, result)
    }

    @Test
    fun `-1 더하기 2는 1이다`() {
        val result = addUseCase.add(-1, 2)
        assertEquals(1, result)
    }
}