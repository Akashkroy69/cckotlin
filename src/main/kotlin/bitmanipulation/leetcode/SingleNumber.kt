package bitmanipulation.leetcode

/*136. Single Number LeetCode
* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4*/
class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        var resXor = 0
        for (element in nums) resXor = resXor xor element
        return resXor
    }

    //?????????????????????????? Have To Understand it.
    fun singleNumber2(nums: IntArray) = nums.reduce(Int::xor)
}

fun main() {
    println(SingleNumber().singleNumber2(intArrayOf(4, 1, 2, 1, 2)))
}