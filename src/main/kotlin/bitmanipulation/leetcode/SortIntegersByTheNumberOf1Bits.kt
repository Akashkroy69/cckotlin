package bitmanipulation.leetcode

/*Sort Integers by The Number of 1 Bits. 1356
* Given an integer array arr. You have to sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.

Return the sorted array.



Example 1:

Input: arr = [0,1,2,3,4,5,6,7,8]
Output: [0,1,2,4,8,3,5,6,7]
Explanation: [0] is the only integer with 0 bits.
[1,2,4,8] all have 1 bit.
[3,5,6] have 2 bits.
[7] has 3 bits.
The sorted array by bits is [0,1,2,4,8,3,5,6,7]
* */
class SortIntegersByTheNumberOf1Bits {
    fun sortByBits(arr: IntArray): IntArray {
        var indexOfNumberWithMost1s = 0
        for (index in arr.indices) {
            println("before swapping Number, in index $index, Number is ${arr[index]} " +
                    " number in indexOfNumberWithMost1s $indexOfNumberWithMost1s Number is ${arr[indexOfNumberWithMost1s]}")
            println("number of set bits in index $index ${arr[index].countOneBits()} " +
                    "number of set bits in index $indexOfNumberWithMost1s ${arr[indexOfNumberWithMost1s].countOneBits()}")
            if (arr[index].countOneBits() < arr[indexOfNumberWithMost1s].countOneBits()) {
                arr[index] = arr[index] xor arr[indexOfNumberWithMost1s]
                arr[indexOfNumberWithMost1s] = arr[index] xor arr[indexOfNumberWithMost1s]
                arr[index] = arr[index] xor arr[indexOfNumberWithMost1s]
            }else indexOfNumberWithMost1s = index

            println("After swapping Number, in index $index, Number is ${arr[index]} " +
                    " number in indexOfNumberWithMost1s $indexOfNumberWithMost1s Number is ${arr[indexOfNumberWithMost1s]}")
            println()

        }
        return arr
    }
}

fun main() {
    for (element in intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8)) print("$element ")
    println()
    for (element in SortIntegersByTheNumberOf1Bits().sortByBits(
        intArrayOf(
            0,
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8
        )
    )) print("$element ")
}