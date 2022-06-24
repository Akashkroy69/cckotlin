package bitmanipulation.leetcode

/*461. Hamming Distance: The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.

 *
 Example 1:

Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.

*/
class HammingDistance {
    fun hammingDistance(x: Int, y: Int): Int {
        var num1 = x
        var num2 = y
        var countDifferentBits = 0
        while (num1 > 0 || num2 > 0) {
            if (num1 and 1 != num2 and 1) countDifferentBits++
            num1 = num1 shr 1
            num2 = num2 shr 1
        }
        return countDifferentBits
    }

    fun hammingDistanceOneLineSolution(x: Int, y: Int) = (x xor y).countOneBits() //kotlin 1.5 and 1.4
    fun hammingDistanceOneLineSolution2(x: Int, y: Int) = Integer.bitCount(x xor y) //Leetcode runs on kotlin 1.3
}

fun main() {
    println(HammingDistance().hammingDistance(1, 3))
}