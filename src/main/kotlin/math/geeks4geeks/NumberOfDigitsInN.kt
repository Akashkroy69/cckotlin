package math.geeks4geeks

import kotlin.math.floor
import kotlin.math.log10

class NumberOfDigitsInN {
    //solution 1 : counting digits and  dividing Number by 10. O(Number of digits)

    //Solution2 : O(1) using Math formulae : number of digits in N = log10(N) + 1.
    fun findNumberOfDigits(num: Int) = floor(log10(num.toDouble())).toInt() + 1
}

fun main() {
    println(NumberOfDigitsInN().findNumberOfDigits(2019))
}