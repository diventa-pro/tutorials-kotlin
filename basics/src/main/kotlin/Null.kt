package pro.diventa.tutorials.kotlin

fun main(args: Array<String>) {

    val canBeNull: String? = null

    // explicit check
    if(canBeNull!=null) println(canBeNull.length)

    // safe call
    println(canBeNull?.length)

    // elvis
    println(canBeNull ?: "null")

}
