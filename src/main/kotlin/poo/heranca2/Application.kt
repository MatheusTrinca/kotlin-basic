package poo.heranca2

import java.time.LocalDate

class Application {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val someone = Pessoa("123131", "Jackson", LocalDate.of(2001, 9, 24))
            someone.adopt(Mammal())
            someone.adopt(Cat())
            someone.adopt(Dog())
            someone.adopt(Fish())

            for(animal in someone.adoptedAnimals) {
//                when  {
//                    animal is Cat -> println("Cat")
//                    animal is Dog -> println("Dog")
//                    animal is Fish -> println("Fish")
//                    animal is Mammal -> println("Mammal")
//                }
                (animal as? Cat)?.miar()
            }
        }
    }
}