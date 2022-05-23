class InvoiceGenerator {
    companion object {
        const val FAIR_PER_KM = 10
        const val FAIR_PER_MIN = 1
    }
    fun calculate(distance: Double, time: Double): Double {
        return ((distance * FAIR_PER_KM) + (time * FAIR_PER_MIN))
    }
}
̦
