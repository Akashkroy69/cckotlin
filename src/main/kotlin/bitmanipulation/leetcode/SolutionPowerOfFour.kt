package bitmanipulation.leetcode

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.log

/** LeetCode Problem: 342. Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4^x.



Example 1:

Input: n = 16
Output: true
 *
 *
 * **/
class SolutionPowerOfFour {
    /**My solution with bit but loop involved*/
    fun isPowerOfFourUsingBitConcepts(n: Int): Boolean {
        var count = 0
        var number = n
        return if (Integer.bitCount(number) == 1 && n > 0) {
            while (number > 1) {
                if ((number and 1) == 0) count++
                else break
                number = number shr 1
            }
            n == 1 || (count % 2) == 0
        } else false
    }

    /**Solution without loop, but with Math not Bit operation*/
    fun isPowerOfFourUsingMath(n: Int): Boolean {
        val powerOnFour = log(n.toDouble(), 4.toDouble())
        return ceil(powerOnFour) == floor(powerOnFour)
    }


    /**Best solution with bit operation while keeping the constraint in check: W/o using LOOP.
     *???????????????????????????????Know the concept behind logic
     * In compared to other solutions it improves the run time drastically
     * */

    fun isPowerOfFourTest(num: Int): Boolean {
        if (num <= 0) {
            return false
        }
        return num % 3 == 1 && (num and (-num) == num)
    }

    /**/
    fun reverseBits(nString: String): Int {

        return Integer.parseInt(nString.reversed(), 2)
    }
}

fun main() {
    /*println(SolutionPowerOfFour().isPowerOfFourUsingBitConcepts(4))
    println("---------------------------------")
    //println(SolutionPowerOfFour().isPowerOfFourUsingMath(-21222222))
    println(Integer.toBinaryString(-2))
    println("---------------------------------")
    println(SolutionPowerOfFour().isPowerOfFourTest(16))*/
print(SolutionPowerOfFour().reverseBits("00000000000000000000000000000010"))
}