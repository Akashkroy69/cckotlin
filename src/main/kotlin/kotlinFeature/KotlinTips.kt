package kotlinFeature

class KotlinTips {

    /** TIP 1::  Build custom string using buildString*/
    fun buildCustomStringUsingBuildAction(): String {
        var counter = 5
        /*
        *--> Using build String we are creating a string which holds numbers from 5 down to 1.
        *--> buildString creates string based on provided 'build action' in the body of Lambda.
        *--> appendLine takes an Integer value, and adds 'this' to StringBuilder, followed by adding '\n' for a new line.
        *--> repeat(5) repeats the Lambda body 5 times.
        *  */
        val countdown = buildString {
            repeat(5) {
                appendLine(counter--)
            }
        }
        return countdown
    }
}

fun main() {
    val buildAString = KotlinTips().buildCustomStringUsingBuildAction()
    println(buildAString)
    //To understand functioning of buildCustomStringUsingBuildAction try to analyze the
    //output from following lines.
    for (element in buildAString.toCharArray()) {
        print("*$element*")
    }
}