package bitmanipulation.leetcode

/*
* 693. Binary Number with Alternating Bits
* Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.



Example 1:

Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101
Example 2:

Input: n = 7
Output: false
Explanation: The binary representation of 7 is: 111.*/
class BinaryNumberWithAlternatingBits {
    fun hasAlternatingBits(n: Int): Boolean {
        var num = n
        var turn = num and 1 == 1 //this will hold true if
        // the right most number in n is 1 else will hold false
        while (num > 0) {
            turn = if (num and 1 == 1 && turn) {
                false
            } else if (num and 1 == 0 && !turn) {
                true
            } else return false
            num = num shr 1
        }
        return true
    }
}

fun main() {
    println(BinaryNumberWithAlternatingBits().hasAlternatingBits(3))
}