package bitmanipulation.leetcode

import kotlin.math.ceil
import kotlin.math.floor

/*169 Majority element
*Given an array nums of size n, return the majority element.

*The majority element is the element that appears more than ⌊n / 2⌋ times.
* You may assume that the majority element always exists in the array.
* Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*
*  */
class SolutionMajorityElement {
    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var temp = -1
        for (index in nums.indices) {
            if (temp != nums[index]) {
                temp = nums[index]
                count = 0
                for (index2 in index until nums.size) {
                    if (nums[index2] == temp) {
                        count++
                    }
                }
            }
            if (count >= ceil((nums.size.toDouble() / 2))) return temp
        }
        return -1
    }

}

fun main() {
    println(SolutionMajorityElement().majorityElement(intArrayOf(1, 2, 1, 1, 1, 2, 2)))
}