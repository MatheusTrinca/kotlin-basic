package poo.classes

import java.time.LocalDate

class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val matheus = Pessoa(
                cpf = "37402767892",
                name = "Matheus",
                birthdate = LocalDate.of(1991, 8, 20)
            )

            matheus.speak("Hello World")
        }
    }
}