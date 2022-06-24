package bitmanipulation.geeks4geeks

class G4GBitManipulationVideoProblems {
    //Problem 1 : find whether the kth bit is set or not
    fun kThBitSetOrNot(number: Int, k: Int) {
        if (number and (1 shl k - 1) != 0) {
            println("The Kth bit is set")
        } else {
            println("The Kth bit is not set")

        }
    }

    //problem 2 : Find whether the number is power of two or not?
    fun powerOf2(number: Int) = number > 0 && (number and number - 1) == 0

    //problem 3: Given a number find how many set bits are there in the binary representation of the number.
    fun numberOfSetBits(number: Int): Int {
        var locNum = number
        var setBitCount = 0
        while (locNum > 0) {
            locNum = locNum shr 1
            setBitCount++
        }
        return setBitCount
    }
    /* ^ the solution takes O(number-of-nits-in-the-given-number) to find set bits
    * We can reduce it to O(number-of-set-bits) by using BRIAN KARNIGHAN ALGORITHM
    * Brian Karnighan algorithm says: n & n-1 will make exactly one set bit, the first set bit found from right, as 0
    * example: n= 110100
    *            -     1
    *           ----------
    * then n-1 =  110011
    * n & n-1 =   110000
    *
    * so in one iteration the algorithm finds and makes exactly one set bit as zero
    * so by repeating the process until n becomes zero will lead us to the number of set bits
    *
    * */

    fun numberOfSetBitsBrianKarnighanAlgorithm(number: Int): Int {
        var tempNumber = number
        var setBitCount = 0
        while (tempNumber > 0) {
            tempNumber = tempNumber and tempNumber - 1
            setBitCount++
        }
        return setBitCount
    }

    //Problem 4: given an array that contains all elements even number of times except one element.
    //find the element occurring odd number of times.
    /*
    * Two property of Xor to remember: 1. n xor n == 0
    *                                  2. 0 xor n == n
    * LOGIC: So if we apply xor on every elements of the array then each pair of numbers
    * will make them self 0 and then one element will remain which with o result into itself
    *  */
    fun oddTimesOccurringElement(arr: IntArray): Int {
        var xorRes = 0
        for (element in arr) {
            xorRes = xorRes xor element
            println(xorRes)
        }
        return xorRes
    }

    /*
    * Problem5: Generate Power Set.
    * Note: This problem can be solved using recursion or Bit Manipulation technique.
    *
    * Example: str= "ABC"
    * Power set = {"","A", "B", "C","AB","BC","CA","ABC"}
    * n=3
    * then number of elements in power set is : 2^3
    * Algorithm:
    * 1. find number of elements in power set using count = 1<<n==1*2^n
    * 2 loop1: i=0<count ????
    * 3      loop2: j=0<n ????
    *             if(i&(1<<j)>0)  ????
    *              print->str[j]
    * */
    fun generatePowerSet(string: String) {
        val countOfElementInPowerSet = 1 shl string.length
        for (iterateOnCountOfElementInPowerSet in 0 until countOfElementInPowerSet) {
            for (iterateOnStringLength in string.indices) {
                if (iterateOnCountOfElementInPowerSet and (1 shl iterateOnStringLength) > 0)
                    print(string[iterateOnStringLength])
            }
            println()
        }

    }

    /*
    *
    * problem 5: Find the length of longest substring of set bits in binary representation of a given number
    * Ex: str= 1101110
    * then the length of longest string f set bits is 3
    *
    * */
    fun lengthOfLongestSubstringInBinaryRepresentationOfANumber(number: Int) {
        var localNumber = number
        var tempCount = 0
        var count = 0
        while (localNumber > 0) {
            tempCount = if ((localNumber and 1) == 1) {
                tempCount + 1
            } else {
                0
            }
            if (count < tempCount) count = tempCount
            localNumber = localNumber shr 1
        }
        println("length Of Longest Substring In Binary Representation Of $number: $count")
    }

    fun lengthOfLongestSubstringInBinaryRepresentationOfANumber(binNumString: String) {
        //http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt%28java.lang.String,%20int%29
        var localNumber = Integer.parseInt(binNumString, 2)
        var tempCount = 0
        var count = 0
        while (localNumber > 0) {
            tempCount = if ((localNumber and 1) == 1) {
                tempCount + 1
            } else {
                0
            }
            if (count < tempCount) count = tempCount
            localNumber = localNumber shr 1
        }
        println("length Of Longest Substring In $binNumString: $count")
    }


}

fun main() {
    /*//val N = readLine()?.toInt()
    val setBCount = G4GBitManipulationVideoProblems().numberOfSetBitsBrianKarnighanAlgorithm(3)
    // println(setBCount)
    val arr = intArrayOf(1, 1, 1, 1, 2, 3, 4, 2, 4, 3, 2)
    println("** ${G4GBitManipulationVideoProblems().oddTimesOccurringElement(arr)} \n hi \n hihi")

    */
    /**To know, understand more about the following line. This was the way of declaring variables I was
     * looking for from a long time**//*
    var (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    println(" $a $b $c")*/
    /*var output = 0
    val N = readLine()?.toInt()
    if (N != null) {
        output = if ((N and 1) == 0) {
            N + 2
        } else N + 1
    }
    val a: Float = 5f
    G4GBitManipulationVideoProblems().test(5)
   */
    G4GBitManipulationVideoProblems().lengthOfLongestSubstringInBinaryRepresentationOfANumber("1101110")

}