package bitmanipulation.leetcode

/*Reverse bits of a given 32 bits unsigned integer.
*
* Input: n = 00000010100101000001111010011100
Output:    964176192 (00111001011110000010100101000000)
Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596,
* so return 964176192 which its binary representation is 00111001011110000010100101000000.
*
* A great way to solving the problem:
*  https://leetcode.com/problems/reverse-bits/discuss/700905/Kotlin-Solution.-Time-Complexity:-O(1)-80.33
*
* */
class SolutionReverseBits {

    fun reverseBits(number: Int): Int {
        val numberAsBits = IntArray(32)
        var localNumber = number
        println(localNumber)

        for (index in 31 downTo 0) {
            /**A great way get the numbers in bit form using bit operation
             * and without using the complex mathematical formulae*/
            numberAsBits[index] = if ((localNumber and 1) == 0) 0 else 1
            localNumber = localNumber shr 1
        }
        var result = 0
        var multiplier = 1
        //To get the decimal number when the binary string of the $number will be reversed.
        //so we are applying the formulae of converting binary string to integer from 0 to 31 in the array
        for (index in 0..31) {
            result += numberAsBits[index] * multiplier
            multiplier *= 2
        }
        return result
    }

    /*
    * Algorithm:
    *step 1 :  run a loop for 32 bits. 0..31
    * step 2: make a place in resultVariable to add 1 or 0
    * by appending 0. we do that by simply shifting resultVariable by 1 bit left.
    * step 3 : we will check whether the rightmost bit is 1? if yes the we will add 1 to fill the space just
    * made with 1 or if the right most bit is 0 then we will leave it as it is.
    * step 4: We will remove the right most bit from the input number as it has been checked.
    * we can do that by shifting right by 1 bit.
    * step 5: we will keep doing the steps 1..4 32 times even after number input becomes 0. after the becomes
    * 0 the loop will keep shifting resVariable left to add 0's to make 00000000000000000000000000000101 into
    * 10100000000000000000000000000000*/
    fun reverseBitsEfficient(number: Int): Int {

        var resultedNumber = 0
        var inputNumber = number
        for (index in 0..31) {
            resultedNumber = resultedNumber shl 1 //make a place in resultVariable to add 1 or 0
            // by appending 0. we do that by simply shifting resultVariable by 1 bit left. At first iteration the number
            //resultedNumber remains 0
            if ((inputNumber and 1) == 1) resultedNumber++ //To check whether the rightmost bit in the input number is 1 or0
            //if the bit is 1 then add it so the space just we made is filled with 1 else it will remain 0
            inputNumber = inputNumber shr 1 //after checking the right most bit we are removing th right most bit
        }
        return resultedNumber
    }

}

fun main() {
    val input = Integer.parseInt("00000010100101000001111010011100", 2)
    /*println(SolutionReverseBits().reverseBits(input))
    println("----------")*/
    println(SolutionReverseBits().reverseBitsEfficient(0))

}