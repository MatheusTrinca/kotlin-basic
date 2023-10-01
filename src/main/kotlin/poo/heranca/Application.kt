package poo.heranca

import java.math.BigDecimal

class Application {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val cientifica = CalculadoraCientifica()

            cientifica.somar(BigDecimal(2))
            cientifica.potencia(2)

        }
    }
}