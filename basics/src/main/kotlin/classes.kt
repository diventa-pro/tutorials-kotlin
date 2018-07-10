package pro.diventa.tutorials.kotlin

fun main(args: Array<String>) {
    val dog = Dog("Angus")
    val cat = Cat("Sylvester")
    funWithAnimal(dog)
    funWithAnimal(cat)
}

fun funWithAnimal(animal: Animal) {
    println( "${animal} talks like that: ${animal.speak()}" )
}

abstract class Animal(name: String) {

    private val name = name

    open abstract fun speak(): String

    override fun toString(): String {
        return "A ${this.javaClass.simpleName} called $name"
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
