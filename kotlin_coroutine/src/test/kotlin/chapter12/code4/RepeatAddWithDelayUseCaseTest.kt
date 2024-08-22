package chapter12.code4

import chapter12.code3.RepeatAddUseCase
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RepeatAddWithDelayUseCaseTest {

    @Test
    fun `100번 더하면 100이 반환된다`() = runBlocking {
        // given
        val repeatAddWithDelayUseCase = RepeatAddWithDelayUseCase()

        // when
        val result = repeatAddWithDelayUseCase.add(100)

        // then
        assertEquals(100, result)
    }
}
