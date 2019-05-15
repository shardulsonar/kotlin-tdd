package challenges

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CloudsTest {

    @Test
    fun getMinimumJumpsTestSampleInput1() {
        val arrayOfClouds: Array<Int> = arrayOf(0, 0, 1, 0, 0, 1, 0)
        val expectedResult = 4

        val clouds = Clouds()
        val actualResult: Int = clouds.getMinimumJumpsRequired(arrayOfClouds)

        Assertions.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun getMinimumJumpsTestSampleInput2() {
        val arrayOfClouds: Array<Int> = arrayOf(0, 0, 0, 0, 1, 0)
        val expectedResult = 3

        val clouds = Clouds()
        val actualResult: Int = clouds.getMinimumJumpsRequired(arrayOfClouds)

        Assertions.assertEquals(expectedResult, actualResult)
    }


}