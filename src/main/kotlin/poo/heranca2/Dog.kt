package poo.heranca2

class Dog: Mammal() {

    fun latir() {
        println("Latir")
    }

    override fun communicate() {
        latir()
    }
}