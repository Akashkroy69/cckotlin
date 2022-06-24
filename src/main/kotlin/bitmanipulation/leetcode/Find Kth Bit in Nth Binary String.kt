package leetcode.bitManipulation

import java.lang.StringBuilder

/*Given two positive integers n and k, the binary string  Sn is formed as follows:

S1 = "0"
Si = Si-1 + "1" + reverse(invert(Si-1)) for i > 1
Where + denotes the concatenation operation, reverse(x) returns the reversed string x, and invert(x) inverts all the bits in x (0 changes to 1 and 1 changes to 0).

For example, the first 4 strings in the above sequence are:

//no space in between, putting the gaps for clarity.
S1 = "0"
S2 = "0 1 1"
S3 = "011 1 001"
S4 = "0111001 1 0110001"
Return the kth bit in Sn. It is guaranteed that k is valid for the given n.



Example 1:

Input: n = 3, k = 1
Output: "0"
Explanation: S3 is "0111001". The first bit is "0".*/
class FindKthBitInNthBinaryString {
    fun findKthBit(n: Int, k: Int): Char {
        when (k) {
            1 -> 0
            2 -> 1
        }

        val listOfStringsForSi = mutableListOf<String>()
        //"0" is going to be there for s1 as per definition
        listOfStringsForSi.add("0")
        println("S1 = ${listOfStringsForSi[0]}")

        //creating and adding string s2, s3......Sn
        for (index in 1 until n) {
            listOfStringsForSi.add(generateString(listOfStringsForSi[index - 1]))
            println("S${index+1} = ${listOfStringsForSi[index]}")
        }
        println("--------------------")

        val nThString = listOfStringsForSi[n - 1]
        return nThString[k - 1]
    }

    private fun generateString(stringSi_1: String): String {
        val additionalString = StringBuilder(stringSi_1)
        //Si = Si-1 + "1" + reverse(invert(Si-1)) so we are going to add 1 in the string
        additionalString.append("1")
        for (index in stringSi_1.indices.reversed()) {
            if (stringSi_1[index] == '1')
                additionalString.append('0')
            else
                additionalString.append('1')
        }
        return additionalString.toString()
    }

}

fun main() {
    /*val str = "akash"
    for (i in str.indices.reversed()) {
        println(i)
    }*/
    println(FindKthBitInNthBinaryString().findKthBit(4,11))
}