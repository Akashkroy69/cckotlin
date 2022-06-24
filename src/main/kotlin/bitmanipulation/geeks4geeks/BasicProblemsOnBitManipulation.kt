package geeksForGeeks.bitmanipulation

//Problem 1: Given a number N, the task is to check whether the given number is a power of 2 or not.
fun isPowerOfTwo(number: Int): Boolean {
    return number > 0 && (number and number - 1) == 0
    /*Logic : if n=4 or 100 which means 2 base 2 exponent
    * n-1 will be equal 011 and if we multiply n & n-1 it will result 0
    *
    * Another way is to use Integer.bitCount(number) if the value is == 1 then the number is power of 2
    * 1-> 2^0= 0001
    * 2-> 2^1= 0010
    * 4-> 2^2= 0100*/
}

/**Problem 2: Given a number N, find the most significant set bit in the given number.
 *Explanation: Input : N = 10
 *Output : 8
 *Binary representation of 10 is 1010
 *The most significant bit corresponds
 *to decimal number 8.
 * */
fun numberWithMostSignificantSetBit(number: Int): Int {
    var numberForIteration = number
    var numberWithMostSigSetBit = 1
    while (numberForIteration > 1) {  //will solve the problem in O(lig2^n) time
        println("--$numberWithMostSigSetBit  --$numberForIteration")
        numberWithMostSigSetBit = numberWithMostSigSetBit shl 1
        numberForIteration = numberForIteration shr 1

    }
    println(numberWithMostSigSetBit)
    return numberWithMostSigSetBit
}

/***
 * Problem 3: Given a number N, the task is to find the XOR of all numbers from 1 to N.

Examples :

Input : N = 6
Output : 7
// 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6  = 7

Input : N = 7
Output : 0
// 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 = 0

Solution:

Find the remainder of N by moduling it with 4.
If rem = 0, then xor will be same as N.
If rem = 1, then xor will be 1.
If rem = 2, then xor will be N+1.
If rem = 3 ,then xor will be 0.


How does this work?
When we do XOR of numbers, we get 0 as XOR value just before a multiple of 4. This keeps repeating before every multiple of 4.

Number Binary-Repr  XOR-from-1-to-n
1         1           [0001]
2        10           [0011]         remainder when divided by 4
3        11           [0000]  <----- We get a 0
4       100           [0100]  <----- Equals to n
5       101           [0001]
6       110           [0111]
7       111           [0000]  <----- We get 0
8      1000           [1000]  <----- Equals to n
9      1001           [0001]
10     1010           [1011]
11     1011           [0000] <------ We get 0
12     1100           [1100] <------ Equals to n
 */
fun xorFrom1ToN(N: Int): Int {
    return when (N % 4) {
        0 -> N
        1 -> 1
        2 -> N + 1
        else -> 0
    }

}

fun main() {
    numberWithMostSignificantSetBit(18)
    println(xorFrom1ToN(7))
}