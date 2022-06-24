package bitmanipulation.geeks4geeks

data class SwappedNumbers(var firstNum: Int, var secondNum: Int)
class ImportantTacticsGeeks4Geeks {
    /*Swapping Two Numbers: We can easily swap two numbers say a
     and b by using the XOR(^) operator by applying below operations:

    a ^= b;
    b ^= a;
    a ^= b;
    */
    fun swapNumbersWithXor(firstNum: Int, secondNum: Int): SwappedNumbers {

        var firstNumber = firstNum
        var secondNumber = secondNum
        firstNumber = firstNumber xor secondNumber
        secondNumber = firstNumber xor secondNumber
        firstNumber = firstNumber xor secondNumber
        println("$firstNumber  $secondNumber")
        return SwappedNumbers(firstNumber, secondNumber)
    }
}

fun main() {
    val (firstNumber, secondNumber) = ImportantTacticsGeeks4Geeks().swapNumbersWithXor(4, 5)
    println("$firstNumber  $secondNumber")
}