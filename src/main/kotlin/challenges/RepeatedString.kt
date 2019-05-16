package challenges

class RepeatedString {
    fun getRepeatedCharacter(string: String, numberOfTimesRepeated: Int): Int {

        var repeatedString = ""
        var index = 0
        var result = 0
        while (index < numberOfTimesRepeated) {
            if (numberOfTimesRepeated - 1 - index >= string.length) {
                repeatedString = repeatedString.plus(string)
                index += string.length
            } else {
                repeatedString = repeatedString.plus(string.substring(0, numberOfTimesRepeated - index))
                index += numberOfTimesRepeated - index
            }
        }
        repeatedString.toCharArray().forEach {char ->
            if (char.equals("a"))
                result++
        }
        return result

    }

}
