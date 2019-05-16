package challenges

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RepeatedStringTest {

    @Test
    fun testRepeatedCharacter(){
        var repeatedString = RepeatedString()
        var string = "aba"
        var numberOfTimesRepeated = 10
        var expected = 7

        var actual = repeatedString.getRepeatedCharacter(string, numberOfTimesRepeated)

        Assertions.assertEquals(expected, actual)
    }
}