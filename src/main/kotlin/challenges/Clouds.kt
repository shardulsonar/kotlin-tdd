package challenges

class Clouds {
    fun getMinimumJumpsRequired(arrayOfClouds: Array<Int>): Int {

        var numberOfJumps = 0
        val sizeOfArray = arrayOfClouds.size
        var indexOfCloud = 0
        while (indexOfCloud < sizeOfArray - 1) {

            numberOfJumps++
            if (indexOfCloud < sizeOfArray - 2 && arrayOfClouds[indexOfCloud + 2] == 0) {
                indexOfCloud += 2
            } else {
                indexOfCloud++
            }
        }
        return numberOfJumps
    }

}
