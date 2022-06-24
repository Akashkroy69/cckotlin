package bitmanipulation.leetcode

/*
*
*Question: 1310. XOR Queries of a SubArray
* Given the array arr of positive integers and the array queries where
*  queries[i] = [Li, Ri], for each query i compute the XOR of elements from Li to
* Ri (that is, arr[Li] xor arr[Li+1] xor ... xor arr[Ri] ).
*  Return an array containing the result for the given queries.
* Example 1:

Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
Output: [2,7,14,8]
Explanation:
The binary representation of the elements in the array are:
1 = 0001
3 = 0011
4 = 0100
8 = 1000
The XOR values for queries are:
[0,1] = 1 xor 3 = 2
[1,2] = 3 xor 4 = 7
[0,3] = 1 xor 3 xor 4 xor 8 = 14
[3,3] = 8
*
*
* Resources:
* 1. http://homepage.cs.uiowa.edu/~ghosh/2-24-09.pdf :XOR is also called modulo-2 addition
* */
class XorSolution {
    fun xorQueries(arr: IntArray, queries: Array<IntArray>): IntArray {
        val resultArray = mutableListOf<Int>()
        for (intArrayElement in queries) {
            val startIndexInIntArrayElement = intArrayElement[0]
            val endIndexInIntArrayElement = intArrayElement[1]
            var xorLocalResult = arr[startIndexInIntArrayElement]
            for (index in startIndexInIntArrayElement + 1..endIndexInIntArrayElement) {
                xorLocalResult = xorLocalResult xor arr[index]
            }
            resultArray.add(xorLocalResult)
        }
        return resultArray.toIntArray()
    }
}

fun main() {
    val arr = intArrayOf(1, 3, 4, 8)
    val queries: Array<IntArray> = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 3), intArrayOf(3, 3))

    XorSolution().xorQueries(arr, queries)
}