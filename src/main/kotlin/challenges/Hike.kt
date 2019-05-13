package challenges

class Hike {
    fun countValleys(numberOfSteps: Int, path: String): Int {

        var levelOfUserFromSea = 0
        var numberOfValleys = 0
        var numberOfMountains = 0
        path.forEach { char ->
            when (char) {
                'U' -> {
                    if (levelOfUserFromSea == 0)
                        numberOfMountains++
                    levelOfUserFromSea++
                }
                'D' -> {
                    if (levelOfUserFromSea == 0)
                        numberOfValleys++
                    levelOfUserFromSea--
                }
            }
        }

        return numberOfValleys
    }

}
