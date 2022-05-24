class Invoice(rides: List<Ride>) {
    val totalFare: Double = rides.sumOf { it.calculateFare() }
    val totalRides: Int = rides.size
    val averageCost: Double = if(rides.isEmpty() ) 0.0 else totalFare / totalRides
}
