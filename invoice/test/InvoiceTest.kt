import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly
import io.kotest.matchers.shouldBe

class InvoiceTest : StringSpec() {

    init {

        "should calculate total fare for given 2 rides" {
            val ride1 = Ride(distance = 1.0, time= 0.0)
            val ride2 = Ride(distance = 1.0, time= 0.0)
            val rides = listOf<Ride>(ride1, ride2)
            val invoice : Invoice = Invoice(rides)
            val expectedFare = 20.0
            invoice.totalFare shouldBeExactly(expectedFare)
        }

        "should calculate total fare for given three rides" {
            val ride1 = Ride(distance = 1.0, time= 0.0)
            val ride2 = Ride(distance = 1.0, time= 0.0)
            val ride3 = Ride(distance = 0.0, time= 0.0)
            val rides = listOf<Ride>(ride1, ride2, ride3)
            val invoice : Invoice = Invoice(rides)
            val expectedFare = 20.0
            invoice.totalFare shouldBeExactly(expectedFare)
        }

        "should return 0 if there are no rides" {
            var rides = listOf<Ride>()
            val invoice : Invoice = Invoice(rides)
            val expectedFare = 0.0
            invoice.totalFare shouldBeExactly(expectedFare)
        }

        "should return average fare of rides" {
            val ride1 = Ride(distance = 1.0, time= 0.0)
            val ride2 = Ride(distance = 2.0, time= 60.0)
            val ride3 = Ride(distance = 0.0, time= 25.0)
            var rides = listOf<Ride>(ride1, ride2, ride3)
            val invoice : Invoice = Invoice(rides)
            val expectedFare = 38.333333333333336
            invoice.averageCost shouldBeExactly(expectedFare)
        }
        "should return Total fare, no of rides and average cost of all rides" {
            val ride1 = Ride(distance = 6.0, time= 0.0)
            val ride2 = Ride(distance = 2.0, time= 30.0)
            val ride3 = Ride(distance = 0.0, time= 10.0)
            var rides = listOf<Ride>(ride1, ride2, ride3)
            val invoice : Invoice = Invoice(rides)
            invoice.totalFare shouldBe(120.0)
            invoice.averageCost shouldBe(40.0)
            invoice.totalRides shouldBe(3)
        }
        "should return invoice if there are no rides" {
            var rides = listOf<Ride>()
            val invoice : Invoice = Invoice(rides)
            invoice.totalFare shouldBe(0.0)
            invoice.averageCost shouldBe(0.0)
            invoice.totalRides shouldBe(0)
        }
    }
}

