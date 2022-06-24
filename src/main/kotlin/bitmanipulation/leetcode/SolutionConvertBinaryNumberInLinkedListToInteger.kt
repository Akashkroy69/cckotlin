package bitmanipulation.leetcode

import java.lang.StringBuilder

/*
*
* Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.
*
*             Example :  head ---> 1 ---------> 0 --------> 1        <---- Linked list

 Example 1:


Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10*/

// Definition for singly-linked list.
class ListNode(var binDigit: Int) {
    var next: ListNode? = null
}

class SolutionConvertBinaryNumberInLinkedListToInteger {
    fun getDecimalValue(head: ListNode): Int {
        val binNumStringForm = StringBuilder()
        var currentNode = head
        while (!currentNode.equals(null)) {
            binNumStringForm.append(currentNode.binDigit)
            currentNode = currentNode.next!!
        }
        return Integer.parseInt(binNumStringForm.toString(), 2)
    }
}

fun main() {
    //println(SolutionConvertBinaryNumberInLinkedListToInteger().getDecimalValue())
}
