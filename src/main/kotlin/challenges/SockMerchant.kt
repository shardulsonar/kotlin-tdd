package challenges

class SockMerchant {
    fun matchPairs(totalNumberOfSocks: Int, arrayOfSocks: Array<Int>): Int {
        var numberOfPairs = 0
        var set  = HashSet<Int>()

        for (item: Int in arrayOfSocks) {
            if (set.contains(item)){
                numberOfPairs++
                set.remove(item)
            } else
                set.add(item)
        }
        return numberOfPairs
    }

}
