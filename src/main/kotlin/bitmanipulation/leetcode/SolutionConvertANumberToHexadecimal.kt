package bitmanipulation.leetcode

import java.lang.StringBuilder

/*
* problem leetcode : 405
* Given an integer num, return a string representing its hexadecimal representation.
* For negative integers, two’s complement method is used.

All the letters in the answer string should be lowercase characters,
* and there should not be any leading zeros in the answer except for the zero itself.

Note: You are not allowed to use any built-in library method to directly solve this problem.



Example 1:

Input: num = 26
Output: "1a"
Example 2:

Input: num = -1
Output: "ffffffff"
*/
class SolutionConvertANumberToHexadecimal {
    fun toHex(num: Int): String {
        if (num == 0) return "0"
        //This UInt will take care of all the negative numbers.
        //for example it will map -1 as 4294967295 and save it into localNum
        //Internally UInt class must be using 2's complement. I have to understand
        // the internal functioning.
        var localNum: UInt = num.toUInt()
        val hexString = StringBuilder()
        val mapHexadecimalValues = mapOf<Int, String>(10 to "a", 11 to "b", 12 to "c", 13 to "d", 14 to "e", 15 to "f")
        while (localNum.toInt() != 0) {
            var tempRemainder = localNum % 16u
            if (tempRemainder.toInt() in 0..9) hexString.append(tempRemainder)
            else hexString.append(mapHexadecimalValues.getValue(tempRemainder.toInt()))
            localNum /= 16u
        }
        return hexString.toString().reversed()
    }
}

fun main() {
    println(SolutionConvertANumberToHexadecimal().toHex(-1))
}