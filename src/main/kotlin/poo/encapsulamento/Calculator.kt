package poo.encapsulamento

import java.math.BigDecimal
import java.math.RoundingMode

class Calculator {

    var result: BigDecimal = BigDecimal.ZERO

    fun sum(a: BigDecimal) {
        result += a
        showResult()
    }

    fun divide(a: BigDecimal) {
        result = result.divide(a, 8, RoundingMode.FLOOR)
        showResult()
    }

    private fun showResult() {
        println("O resultado é $result")
    }
}