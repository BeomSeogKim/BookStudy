package chapter12.code5

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestCoroutineScheduler
import kotlinx.coroutines.test.TestDispatcher
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestCoroutineScheduler {

    @Test
    fun `가상 시간 조절 테스트()`() {
        // 테스트 환경 설정
        val testCoroutineScheduler = TestCoroutineScheduler()

        testCoroutineScheduler.advanceTimeBy(5000L) // 가상환경에서 5초가 흐름 -> total : 5sec
        assertEquals(5000L, testCoroutineScheduler.currentTime)

        testCoroutineScheduler.advanceTimeBy(6000L) // 가상환경에서 6초가 흐름 -> total : 11sec
        assertEquals(11000L, testCoroutineScheduler.currentTime)

        testCoroutineScheduler.advanceTimeBy(10000L) // 가상환경에서 10초가 흐름 -> total : 21sec
        assertEquals(21000L, testCoroutineScheduler.currentTime)
    }

    @Test
    fun `가상 시간 위에서 테스트 진행`() {
        // 테스트 환경 설정
        val testCoroutineScheduler: TestCoroutineScheduler = TestCoroutineScheduler()
        val testDispatcher: TestDispatcher = StandardTestDispatcher(scheduler = testCoroutineScheduler)
        val testCoroutineScope: CoroutineScope = CoroutineScope(context = testDispatcher)

        // given
        var result = 0

        // when
        testCoroutineScope.launch {
            delay(10000L)   // 10초간 대기
            result = 1
            delay(10000L)   // 10초간 대기
            result = 2
            println(Thread.currentThread().name)
        }

        // then
        assertEquals(0, result)

        testCoroutineScheduler.advanceTimeBy(5000L) // 가상 시간에서 5초 흐르게 만듦
        assertEquals(0, result)

        testCoroutineScheduler.advanceTimeBy(6000L) // 가상 시간에서 6초 흐르게 만듦
        assertEquals(1, result)

        testCoroutineScheduler.advanceTimeBy(10000L) // 가상 시간에서 10초 흐르게 만듦
        assertEquals(2, result)
    }

    @Test
    fun `advanceUntilIdle의 동작 살펴보기`() {
        // 테스트 환경 설정
        val testCoroutineScheduler = TestCoroutineScheduler()
        val testDispatcher = StandardTestDispatcher(scheduler = testCoroutineScheduler)
        val testCoroutineScope = CoroutineScope(context = testDispatcher)

        // given
        var result = 0

        // when
        testCoroutineScope.launch {
            delay(10000L)   // 10초간 대기
            result = 1
            delay(10000L)   // 10초간 대기
            result = 2
            println(Thread.currentThread().name)
        }

        testCoroutineScheduler.advanceUntilIdle()   // testCoroutineScope 내부의 코루틴이 모두 실행되게 만들어준다.

        // then
        assertEquals(2, result)
    }

    @Test
    fun `StandardTestDispatcher 사용하기`() {
        // 테스트 환경 설정
        val testDispatcher = StandardTestDispatcher()
        val testCoroutineScope = CoroutineScope(context = testDispatcher)

        // given
        var result = 0

        // when
        testCoroutineScope.launch {
            delay(10000L)   // 10초간 대기
            result = 1
            delay(10000L)   // 10초간 대기
            result = 2
            println(Thread.currentThread().name)
        }

        testDispatcher.scheduler.advanceUntilIdle() //testCoroutineScope 내부의 코루틴이 모두 실행되게 만들어 줌.

        // then
        assertEquals(2, result)
    }
}
