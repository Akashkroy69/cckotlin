package bitmanipulation.leetcode
/*
*
* 191. Number of 1 Bits
* Write a function that takes an unsigned integer and
* returns the number of '1' bits it has
*(also known as the Hamming weight).
*
*
* */
class SolutionNumberOfOneBits {

    //you need treat n as an unsigned value
    fun hammingWeight(n: Int): Int {
        var num: UInt = n.toUInt()
        var setCountBit = 0
        while (num.toInt() > 0) {
            setCountBit++
            num = num and num - 1u
            /* if ((num and 1).toInt() == 1) setCountBit++
             num = num shr 1*/
        }
        return setCountBit

    }

}

fun main() {
    val input = Integer.parseInt("11111111111111111111111111111101",2)
    //println(SolutionNumberOfOneBits().hammingWeight(input))
}