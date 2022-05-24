data class Ride(val distance: Double, val time: Double) {
    companion object {
        const val FAIR_PER_KM = 10
        const val FAIR_PER_MIN = 1

    }

    fun calculateFare() = distance * FAIR_PER_KM + time * FAIR_PER_MIN
}
