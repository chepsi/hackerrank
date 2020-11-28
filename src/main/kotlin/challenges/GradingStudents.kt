package challenges

import kotlin.math.ceil

/**
 * Link to the problem
 * https://www.hackerrank.com/challenges/grading/problem
 * */

/*
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    val intArray = arrayListOf<Int>()
    grades.asSequence().forEach { grade ->
        if (grade in 0..100){
            when {
                grade<38 -> {
                    intArray.add(grade)
                }
                ((ceil(grade.toDouble()/5) *5) - grade) <3 -> {
                    intArray.add((ceil(grade.toDouble()/5) *5).toInt())
                }
                else -> {
                    intArray.add(grade)
                }
            }
        }
        else{
            intArray.add(grade)
        }

    }
    return intArray.toTypedArray()
}

fun main() {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array(gradesCount) { 0 }
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
