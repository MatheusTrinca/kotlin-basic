package poo.heranca2

import java.time.LocalDate

class Pessoa(
    val cpf: String,
    val name: String,
    val birthdate: LocalDate
) {

    val age = LocalDate.now().year - birthdate.year

    val adoptedAnimals = mutableListOf<Animal>()

    var email = ""
        set(value) {
            //Sempre trocar por field dentro do get/set
            if(!Regex("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}\$").matches(value)) {
                throw Exception("Oops invalid email address")
            }
            field = value
        }

    fun speak(message: String) {
        println("$name spoke: $message with email: $email")
    }

    fun adopt(animal: Animal) {
        adoptedAnimals.add(animal)
    }
}