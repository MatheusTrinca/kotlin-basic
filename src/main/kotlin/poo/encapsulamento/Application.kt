package poo.encapsulamento

import java.math.BigDecimal

class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val calculator = Calculator()

            calculator.sum(BigDecimal(2))

            calculator.divide(BigDecimal(9))

        }
    }
}