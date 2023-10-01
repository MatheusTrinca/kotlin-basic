package poo.heranca2

class Cat: Mammal() {

    fun miar() {
        println("Miau")
    }

    override fun communicate() {
        // comportamento da classe pai
        // super.communicate()

        // override
        miar()
    }
}