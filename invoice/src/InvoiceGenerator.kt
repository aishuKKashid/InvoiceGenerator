class InvoiceGenerator {


//    fun calculateRide(ride : Ride) : Double {
//        return ride.distance * FAIR_PER_KM + ride.time * FAIR_PER_MIN
//    }
    fun calculate(rides : List<Ride>): Double {
        val total = rides.sumOf {
            it.calculateFare()
        }
        return total
    }


}
