package challenges

import java.math.BigInteger
import java.util.*

/**
 * Link to the problems
 * https://www.hackerrank.com/challenges/extra-long-factorials/problem*/

fun extraLongFactorials(n: Int): Unit {
    var answer = BigInteger.ONE
    for (i in 1..n){
        answer = answer.times(BigInteger.valueOf(i.toLong()))
    }
    return println(answer)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    extraLongFactorials(n)
}
