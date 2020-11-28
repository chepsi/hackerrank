import challenges.gradingStudents
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test
import java.util.*


class GradingStudentsTest {
    @Test
    fun `Test That grading students does so correctly`(){
        val intArray = arrayOf(73,67,38,33)
        val expectedResult = arrayOf(75,67,40,33)
        assertTrue(expectedResult.contentEquals(gradingStudents(intArray)))
    }
}