import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly

class InvoiceTest : StringSpec() {

    init {
        val invoiceGenerateor : InvoiceGenerator = InvoiceGenerator()
        "should calculate fair with given distance and time" {
            val ride = Ride(distance = 1.0, time= 1.0)
            var rides = listOf<Ride>(ride)
            var actualFair : Double = invoiceGenerateor.calculate(rides)
            actualFair.shouldBeExactly(11.0)
        }
        "should return 10 for distance 1 KM and time 0 min" {
            val ride = Ride(distance = 1.0, time= 0.0)
            var rides = listOf<Ride>(ride)
            var actualFair : Double = invoiceGenerateor.calculate(rides)
            actualFair.shouldBeExactly(10.0)
        }

        "should calculate total fair for given 2 rides" {
            val ride1 = Ride(distance = 1.0, time= 0.0)
            val ride2 = Ride(distance = 1.0, time= 0.0)
            var rides = listOf<Ride>(ride1, ride2)
            var actualFair = invoiceGenerateor.calculate(rides)
            val expectedFair = 20.0
            actualFair.shouldBeExactly(expectedFair)
        }

        "should calculate total fair for given three rides" {
            val ride1 = Ride(distance = 1.0, time= 0.0)
            val ride2 = Ride(distance = 1.0, time= 0.0)
            val ride3 = Ride(distance = 0.0, time= 2.0)
            var rides = listOf<Ride>(ride1, ride2, ride3)
            var actualFair = invoiceGenerateor.calculate(rides)
            val expectedFair = 22.0
            actualFair.shouldBeExactly(expectedFair)
        }

        "should return 0 if there are no rides" {
            var rides = listOf<Ride>()
            var actualFair = invoiceGenerateor.calculate(rides)
            val expectedFair = 0.0
            actualFair.shouldBeExactly(expectedFair)
        }
    }
}

