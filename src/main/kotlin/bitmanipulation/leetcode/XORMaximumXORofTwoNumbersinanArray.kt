package leetcode.bitManipulation

/*
* problem: Given an integer array nums,
* return the maximum result of nums[i] XOR nums[j], where 0 <= i ≤ j < n.

Follow up: Could you do this in O(n) runtime?

* Example 1:

Input: nums = [3,10,5,25,2,8]
Output: 28
Explanation: The maximum result is 5 XOR 25 = 28.
*
*
* */
class XORMaximumXORofTwoNumbersInAnArray {
    fun findMaximumXOR(nums: IntArray): Int {
        var tempMaxXorRes = 0
        var maxXorRes = 0
        for (index in nums.indices) {
            for (localIndex in index + 1 until nums.size) {
                val resultXor = nums[index] xor nums[localIndex]
                if (tempMaxXorRes < resultXor) tempMaxXorRes = resultXor
            }
            if (maxXorRes < tempMaxXorRes) maxXorRes = tempMaxXorRes
        }
        return maxXorRes
    }
}

fun main() {
    val numbers = intArrayOf(2,4)
    XORMaximumXORofTwoNumbersInAnArray().findMaximumXOR(numbers)
}