package org.example

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class TwoSumTest {
    @Test
    fun testSum() {
        val target = 9
        val arr = listOf(2, 5, 7, 10, 12, 11)
        val result = twoSum(target, arr)
        assertTrue(result.contains(0))
        assertTrue(result.contains(2))
    }
    
    @Test
    fun testSum2() {
        val target = 16
        val arr = listOf<Int>(3, 6, 9, 12, 4, 8)
        val result = twoSum(target, arr)
        assertTrue(result.contains(3))
        assertTrue(result.contains(4))
    }
}