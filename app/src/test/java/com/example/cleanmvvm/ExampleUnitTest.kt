package com.example.cleanmvvm

import org.junit.Test

import org.junit.Assert.*

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
}
