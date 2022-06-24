package bitmanipulation.leetcode

/*
* leetcode 1342 SolutionNumberOfStepsToReduceANumberToZero

* Given a non-negative integer num, return the number of steps to reduce it to zero.
*  If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.



Example 1:

Input: num = 14
Output: 6
Explanation:
Step 1) 14 is even; divide by 2 and obtain 7.
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3.
Step 4) 3 is odd; subtract 1 and obtain 2.
Step 5) 2 is even; divide by 2 and obtain 1.
Step 6) 1 is odd; subtract 1 and obtain 0.*/
class SolutionNumberOfStepsToReduceANumberToZero {
    fun numberOfSteps(num: Int): Int {
        var number = num
        var numberOfSteps = 0
        while (number > 0) {
            number = if (number and 1 == 0) {
                number shr 1
            } else {
                number - 1
            }
            numberOfSteps++
        }
        return numberOfSteps
    }
//Algorithm: if num is 14.
    /*
    * num = 14
    * step 1 num.toString(2)--------> "1110"
    * ----> 1110 is even so we have to divide by 2 or using bit operation we just have to right shift by 1
    * ----> now num = 111. according to the problem statement we have to subtract by 1
    * so, 111
    *    -001       this takes one step
    * ----------
    *     110   ----> Now again it became even so we have to right shift by 1 <--- this takes one step
    * so, for getting over 1 we need 2 steps.
    * except the last 1 bit---------> for the last 1 bit to get over it we need only one step; subtraction by 1
    *      1
    *     -1
    * ---------
    *      0
    * step 2: count the number of '1' and multiply with 2 <-- these many steps needed to get rid of 1's
    * step 3 : subtract 1 <-- as the to get rid of the last 1 we just need only 1 step
    * step 4: count the number of '0' <--- these many steps will be needed to get rid of 0s
    * */
    //                                  step 1
    fun numberOfStepsTest(num: Int) = num.toString(2).let { s ->
    //          step 2              step 3         step 4
        s.count { it == '1' } * 2     -1     +  s.count{it == '0'}
    }
}

fun main() {
    println(SolutionNumberOfStepsToReduceANumberToZero().numberOfSteps(123))
    println(SolutionNumberOfStepsToReduceANumberToZero().numberOfStepsTest(123))
}