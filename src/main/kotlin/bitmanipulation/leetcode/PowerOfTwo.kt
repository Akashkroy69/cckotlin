package leetcode.bitManipulation

/*Power Of Two:
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.

Constraints:

-231 <= n <= 231 - 1


Example 1:

Input: n = 1
Output: true
Explanation: 2^0 = 1

Example 2:
Input: n = 16
Output: true
Explanation: 2^4 = 16

Example 3:
Input: n = 3
Output: false
Example 4:

Input: n = 4
Output: true
*/
class PowerOfTwo {
    fun isPowerOfTwo(n: Int) = n > 0 && (n and n - 1) == 0
}

fun main() {
    println(PowerOfTwo().isPowerOfTwo(-1))
}