package machine

fun main() {
//    println("""
//        Starting to make a coffee
//        Grinding coffee beans
//        Boiling water
//        Mixing boiled water with crushed coffee beans
//        Pouring coffee into the cup
//        Pouring some milk into the cup
//        Coffee is ready!
//    """.trimIndent())
    println("Write how many cups of coffee you will need:")
    val cups = readln().toInt()
    println("For $cups cups of coffee you will need:")
    println("${cups * 200} ml of water")
    println("${cups * 50} ml of milk")
    println("${cups * 15} g of coffee beans")
}
