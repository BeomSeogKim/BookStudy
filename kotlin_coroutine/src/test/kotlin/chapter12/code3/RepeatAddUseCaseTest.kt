package chapter12.code3

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RepeatAddUseCaseTest {

//    @Test
//    fun `100번 더하면 100이 반환된다`() {
//        // given
//        val repeatAddUseCase = RepeatAddUseCase()
//
//        // when
//        val result = repeatAddUseCase.add(100)  // compile error - add는 일시중단 함수인데, 테스트 함수는 일반 함수이기 때문에.
//
//        // then
//        assertEquals(100, result)
//    }

    // runBlocking을 통한 테스트를 진행 시 만약 시간이 오래걸리는 함수가 있다면 문제가 발생한다.
    @Test
    fun `100번 더하면 100이 반환된다`() = runBlocking {
        // given
        val repeatAddUseCase = RepeatAddUseCase()

        // when
        val result = repeatAddUseCase.add(100)  // compile error - add는 일시중단 함수인데, 테스트 함수는 일반 함수이기 때문에.

        // then
        assertEquals(100, result)
    }
}
