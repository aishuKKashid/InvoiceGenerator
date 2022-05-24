class InvoiceGenerator {
    companion object {
        const val FAIR_PER_KM = 10
        const val FAIR_PER_MIN = 1
    }
    fun calculate(rides : List<Ride>): Double {
        val total = rides.sumOf {
            it.distance * FAIR_PER_KM + it.time * FAIR_PER_MIN
        }
        return total
    }
}
