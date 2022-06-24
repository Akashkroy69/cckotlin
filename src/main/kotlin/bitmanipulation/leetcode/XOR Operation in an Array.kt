package leetcode.bitManipulation


/*
* Problem:1486. XOR Operation in an Array
* Given an integer n and an integer start.

Define an array num where num[i] = start + 2*i (0-indexed) and n == num.length.

Return the bitwise XOR of all elements of num.



Example 1:

Input: n = 5, start = 0
Output: 8
Explanation: Array num is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
Where "^" corresponds to bitwise XOR operator.*/
class XOROperationInAnArray {

    fun xorOperation(n: Int, start: Int): Int {
        //to declare an array with 5 elements we use IntArray
        val num = IntArray(n)
        for (index in 0 until n) {
            num[index] = start + 2 * index
        }
        var resultXor = num[0]
        for (index in 1 until n) {
            resultXor = resultXor xor num[index]
        }
        println(resultXor)
        return resultXor
    }
    fun xorOperationWithFunctionalProgramming(n: Int, start: Int): Int {
        //another way to declare and define an array while adding the elements to it is THROUGH FUNCTIONAL PROGRAMMING USING
        //LAMBDA
        val numArray= IntArray(n) { i -> start + 2 * i }
        var resultXor = numArray[0]
        for (index in 1 until n) {
            resultXor = resultXor xor numArray[index]
        }
        println(resultXor)
        return resultXor
    }
}

fun main() {
    XOROperationInAnArray().xorOperation(5, 0)
    XOROperationInAnArray().xorOperationWithFunctionalProgramming(5, 0)
    /*val num3 = IntArray(5, { i -> i * 2 + 3})
    println(Arrays.toString(num3))*/
}