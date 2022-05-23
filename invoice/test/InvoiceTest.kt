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
//        "should return an error if one of the value is negative" {
//            var fair : Double = invoiceGenerateor.calculate(-1.0, 0.0)
//            fair.shouldBeExactly(0.0)
//        }
        "should return 10 for distance 1 KM and time 0 min" {
            val ride = Ride(distance = 1.0, time= 0.0)
            var rides = listOf<Ride>(ride)
            var actualFair : Double = invoiceGenerateor.calculate(rides)
            actualFair.shouldBeExactly(10.0)
        }

        "should calculate total fair of all the given rides" {
            val ride = Ride(distance = 1.0, time= 0.0)
            var rides = listOf<Ride>(ride)
            var actualFair = invoiceGenerateor.calculate(rides)
            val expectedFair = 10.0
            actualFair.shouldBeExactly(expectedFair)
        }
    }
}
