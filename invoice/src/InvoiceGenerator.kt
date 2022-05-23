class InvoiceGenerator {
    companion object {
        const val FAIR_PER_KM = 10
        const val FAIR_PER_MIN = 1
    }
    fun calculate(rides : List<Ride>): Double {
        val (distance, time) = rides[0]
        return ((distance * FAIR_PER_KM) + (time * FAIR_PER_MIN))
//        return 0.0
    }
}
