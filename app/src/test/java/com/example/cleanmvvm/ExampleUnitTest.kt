package com.example.cleanmvvm

import kotlinx.coroutines.delay
import kotlinx.coroutines.test.runTest
import org.junit.Test

import org.junit.Assert.*
import kotlin.random.Random

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(listOf(6).result(), true)
    }

    private fun List<Int>.result() = this
        .map(::doSomeThing1)
        .filter(::doSomeThing2)
        .map { "result is not empty  $it" }
        .isNotEmpty()

    private fun doSomeThing1(tmp: Int) : Int = tmp.div(2)
    private fun doSomeThing2(tmp: Int) : Boolean = tmp % 2 == 1

    @Test
    fun testCoroutine() = runTest {
        assertEquals(returnNumber(), 5)
    }

    private suspend fun returnNumber(): Int {
        delay(50L)
        return Random.nextInt(10)
    }
}
