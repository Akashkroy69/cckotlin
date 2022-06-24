package bitmanipulation.leetcode

import kotlin.system.measureNanoTime

/*
* problem : 268
* Given an array nums containing n distinct numbers in the range [0, n],
*  return the only number in the range that is missing from the array.

Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?



Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is
*  the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the
*  missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in
* the range since it does not appear in nums.
* */
class SolutionMissingNumber {
    //Solution 1
    fun missingNumber(nums: IntArray) = nums.size * (nums.size + 1) / 2 - nums.sum()

    //solution 2 with Bitwise operation
    fun missingNumberXor(nums: IntArray): Int {
        var res = 0
        for (i in nums.indices) {
            res = res xor i xor nums[i]
        }
        return res xor nums.size
    }

    //Solution 3
    fun missingNumberXorTest(nums: IntArray): Int {
        var res = 0
        (nums.indices).forEach {
            res = res xor it xor nums[it]
        }
         return res xor nums.size
    }

    //Solution 4
    //val nums3 = IntArray(5, { i -> i * 2 + 3})
    fun missingNumberXorLambda(nums: IntArray) {
        // TODO()
    }


}


fun main() {
    val timeMeasured1 = measureNanoTime {
        println(SolutionMissingNumber().missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
        println(SolutionMissingNumber().missingNumber(intArrayOf(0, 1)))
        println(SolutionMissingNumber().missingNumber(intArrayOf(3, 0, 1)))
    }
    println("------------------------------------------")
    val timeMeasured2 = measureNanoTime {
        println(SolutionMissingNumber().missingNumberXor(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
        println(SolutionMissingNumber().missingNumberXor(intArrayOf(0, 1)))
        println(SolutionMissingNumber().missingNumberXor(intArrayOf(3, 0, 1)))
    }
    println("----------------------------")
    val timeMeasured3 = measureNanoTime {
        println(SolutionMissingNumber().missingNumberXorTest(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
        println(SolutionMissingNumber().missingNumberXorTest(intArrayOf(0, 1)))
        println(SolutionMissingNumber().missingNumberXorTest(intArrayOf(3, 0, 1)))
    }

    println("---------")
    println("1: $timeMeasured1 2: $timeMeasured2 3: $timeMeasured3")
    println("------lambda test-------")

    println(SolutionMissingNumber().missingNumberXorLambda(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
    println("--------------")


}


