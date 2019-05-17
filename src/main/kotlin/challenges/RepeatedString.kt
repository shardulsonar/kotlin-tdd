package challenges

class RepeatedString {
    fun getRepeatedCharacter(string: String, numberOfChars: Long): Long {

        val countOfAInString: Long = string.count { char: Char -> char == 'a' }.toLong()
        val mod: Long = numberOfChars % string.length
        val numberOfTimesStringRepeated: Long = numberOfChars / string.length

        val result: Long = countOfAInString * numberOfTimesStringRepeated + (string.substring(0, mod.toInt()).count { char: Char -> char == 'a' }.toLong())

        return  result
    }
}
