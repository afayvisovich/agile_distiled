package katas

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FizzBuzzTest {

    @Test
    fun fizzBuzzShouldReturnTrueForLeap() {
        val fb = FizzBuzz()
        val num = 1
        assertEquals("1", fb.fizzBuzz(num))
    }
}