package challenges

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RepeatedStringTest {

    @Test
    fun testRepeatedCharacter(){
        val repeatedString = RepeatedString()
        val string = "aba"
        val numberOfTimesRepeated : Long= 10
        val expected : Long = 7

        val actual: Long = repeatedString.getRepeatedCharacter(string, numberOfTimesRepeated)

        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun testRepeatedCharacterSampleInput2(){
        val repeatedString = RepeatedString()
        val string = "a"
        val numberOfTimesRepeated : Long= 1000
        val expected : Long = 1000

        val actual: Long = repeatedString.getRepeatedCharacter(string, numberOfTimesRepeated)

        Assertions.assertEquals(expected, actual)
    }
}