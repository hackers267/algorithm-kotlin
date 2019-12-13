package org.example

fun twoSum(target: Int, arr: List<Int>): List<Int> {
    val map: MutableMap<Int, Int> = mutableMapOf()
    val size: Int = arr.size
    for (left: Int in 0 until size) {
        val leftValue: Int = arr[left]
        val rightValue: Int = target - leftValue
        val right: Int? = map[rightValue]
        if (right != null) {
            return listOf(left, right)
        }
        map[leftValue] = left
    }
    return listOf()
}

fun main() {
    val target = 9
    val arr = listOf(2, 5, 7, 10, 12, 11)
    val result = twoSum(target = target, arr = arr)
    println(result)
}