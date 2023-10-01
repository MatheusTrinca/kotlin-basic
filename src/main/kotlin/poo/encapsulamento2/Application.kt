package poo.encapsulamento2

import java.time.LocalDate

class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val pessoa = Pessoa("32234242", "Matheus", LocalDate.of(2001, 9,22))

            pessoa.email = "teste@teste.com"

            pessoa.speak("Algum teste")
        }
    }
}