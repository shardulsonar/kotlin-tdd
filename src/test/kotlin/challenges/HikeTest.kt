package challenges

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class HikeTest {

    @Test
    fun countValleysTest(){
        val hike = Hike()
        val numberOfSteps = 6
        val path = "UDDDUU"
        val expectedResult = 1

        val actualResult : Int = hike.countValleys(numberOfSteps, path);
        Assertions.assertEquals(expectedResult, actualResult)

    }
    @Test
    fun countValleysTest2(){
        val hike = Hike()
        val numberOfSteps = 12
        val path = "DDUUDDUDUUUD"
        val expectedResult = 2

        val actualResult : Int = hike.countValleys(numberOfSteps, path);
        Assertions.assertEquals(expectedResult, actualResult)

    }
}