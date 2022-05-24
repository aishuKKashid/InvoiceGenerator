class InvoiceGenerator {
    companion object {
        const val FAIR_PER_KM = 10
        const val FAIR_PER_MIN = 1
    }

    fun calculateRide(ride : Ride) : Double {
        return ride.distance * FAIR_PER_KM + ride.time * FAIR_PER_MIN
    }
    fun calculate(rides : List<Ride>): Double {
        val total = rides.sumOf {
            it.distance * FAIR_PER_KM + it.time * FAIR_PER_MIN
        }
        return total
    }
}
