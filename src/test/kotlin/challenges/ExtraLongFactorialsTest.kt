package challenges

import junit.framework.TestCase
import org.junit.Test

class ExtraLongFactorialsTest {
    @Test
    fun `Test That extraLongCalculations does so correctly`(){
        extraLongFactorials(25)
        val result = println("15511210043330985984000000")
        TestCase.assertTrue(extraLongFactorials(25) == result)
    }
}