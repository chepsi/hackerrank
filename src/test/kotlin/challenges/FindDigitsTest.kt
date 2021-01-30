package challenges

import org.junit.Assert.assertTrue
import org.junit.Test

class FindDigitsTest {
    @Test
    fun `Test that find digits returns the correct number of divisors`(){
        val result0 = findDigits(12)
        val result1 = findDigits(1012)
        val expectedResult0 = 2
        val expectedResult1 = 3
        assertTrue(expectedResult0 == result0)
        assertTrue(expectedResult1 == result1)
    }
}