package bitmanipulation.leetcode

/*1720. Decode XORed Array
* There is a hidden integer array arr that consists of n non-negative integers.

It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].

You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].

Return the original array arr. It can be proved that the answer exists and is unique.



Example 1:

Input: encoded = [1,2,3], first = 1
Output: [1,0,2,1]
Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
Example 2:

Input: encoded = [6,2,7,3], first = 4
Output: [4,2,0,7,4]
* */
class SolutionDecodeXORedArray {
    /*Logic : Given ->encoded[i] = arr[i] XOR arr[i + 1]
    * From Xor property we know: If x ^ y = z. Then x ^ z = y
    *               y ^ z = x
 Ex 1 ^ 2 = 3. Then 1 ^ 3 = 2
                    2 ^ 3 = 1
    * So arr[i+1] = encoded[i] xor arr[i]
    *
    * */
    fun decode(encoded: IntArray, first: Int): IntArray {
        var decoded = IntArray(encoded.size + 1)
        decoded[0] = first
        for (index in encoded.indices) {
            decoded[index + 1] = decoded[index] xor encoded[index]
        }
        return decoded
    }
}

fun main() {
    val decodedArr = SolutionDecodeXORedArray().decode(intArrayOf(6,2,7,3), 4)
    for (element in decodedArr){
        println(element)
    }
}