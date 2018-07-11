package pro.diventa.tutorials.kotlin

abstract class Animal(name: String) {

    private val name = name

    open abstract fun speak(): String

    override fun toString(): String {
        return "a ${this.javaClass.simpleName.toLowerCase()} called $name"
    }

    fun describe(): String {
        return "${this} talks like that: ${this.speak()}"
    }
}

class Dog(name: String) : Animal(name) {
    override fun speak(): String {
        return "bark"
    }
}

class Cat(name: String) : Animal(name) {
    override fun speak(): String {
        return "meoow"
    }
}
