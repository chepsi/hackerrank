package challenges

import java.util.*


fun findDigits(n: Int): Int {
    var numberOfDivisors = 0
    val numbersList = n.toString().toCharArray()
    numbersList.forEach {
        if (it.toString().toInt() != 0){
            if (n % it.toString().toInt() == 0){
                numberOfDivisors += 1
            }
        }
    }

    return numberOfDivisors
}

fun main() {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val result = findDigits(n)

        println(result)
    }
}