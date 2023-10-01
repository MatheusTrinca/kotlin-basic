package poo.classes

import java.time.LocalDate

class Pessoa(
    val cpf: String,
    val name: String,
    val birthdate: LocalDate
) {

    val age = LocalDate.now().year - birthdate.year

    fun speak(message: String) {
        println("$name spoke: $message")
    }
}