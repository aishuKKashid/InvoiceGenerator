import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.shouldBeExactly

class InvoiceTest : StringSpec() {

    init {
        val invoiceGenerateor : InvoiceGenerator = InvoiceGenerator()
        "should calculate fair with given distance and time" {

            var actualFair : Double = invoiceGenerateor.calculate(-1.0, 0.0)
            actualFair.shouldBeExactly(-10.0)
        }
//        "should return an error if one of the value is negative" {
//            var fair : Double = invoiceGenerateor.calculate(-1.0, 0.0)
//            fair.shouldBeExactly(0.0)
//        }
        "should return 10 for distance 1 KM and time 0 min" {
            var actualFair : Double = invoiceGenerateor.calculate(1.0, 0.0)
            actualFair.shouldBeExactly(10.0)
        }
    }
}
