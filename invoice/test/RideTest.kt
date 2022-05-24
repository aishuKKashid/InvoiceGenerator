import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly

class RideTest : StringSpec(){

    init {

        "should calculate fare with given distance and time" {
            val ride = Ride(distance = 0.0, time= 0.0)
            var actualFair : Double = ride.calculateFare()
            actualFair.shouldBeExactly(0.0)
        }
        "should return 10 for distance 1 KM and time 0 min" {
            val ride = Ride(distance = 1.0, time= 0.0)
            var actualFair : Double = ride.calculateFare()
            actualFair.shouldBeExactly(10.0)
        }

        "should return 1.0 for distance 0 KM and time 1 min" {
            val ride = Ride(distance = 0.0, time= 1.0)
            var actualFair : Double = ride.calculateFare()
            actualFair.shouldBeExactly(1.0)
        }
    }
}
