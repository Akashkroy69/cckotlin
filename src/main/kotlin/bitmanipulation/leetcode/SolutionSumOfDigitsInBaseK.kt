package bitmanipulation.leetcode
/* Problem number 1837, SolutionSumOfDigitsInBaseK  */
class SolutionSumOfDigitsInBaseK {
    fun sumBase(n: Int, k: Int): Int {
        var sumOfDigitsInBaseK = 0
        var num = n
        while (num > 0) {
            val remainder = num % k
            sumOfDigitsInBaseK += remainder
            num /= k
        }
        return sumOfDigitsInBaseK
    }
}

fun main() {
    println(SolutionSumOfDigitsInBaseK().sumBase(10,10))
}