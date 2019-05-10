package challenges

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


internal class SockMerchantTest {

    @Test
    fun matchPairsTest() {
        val sockMerchant = SockMerchant()
        val totalNumberOfSocks = 9
        val arrayOfSocks: Array<Int> = arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)
        val expectedNumberOfPairs = 3
        val actualNumberOfPairs: Int = sockMerchant.matchPairs(totalNumberOfSocks, arrayOfSocks)
        Assertions.assertEquals(expectedNumberOfPairs, actualNumberOfPairs)
    }

}