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

//    println("Write how many cups of coffee you will need:")
//    val cups = readln().toInt()
//    println("For $cups cups of coffee you will need:")
//    println("${cups * 200} ml of water")
//    println("${cups * 50} ml of milk")
//    println("${cups * 15} g of coffee beans")

    println("Write how many ml of water the coffee machine has:")
    val water = readln().toInt()
    println("Write how many ml of milk the coffee machine has:")
    val milk = readln().toInt()
    println("Write how many grams of coffee beans the coffee machine has:")
    val beans = readln().toInt()
    println("Write how many cups of coffee you will need:")
    val cups = readln().toInt()
    val minCups = mutableListOf<Int>(water/200, milk/50, beans/15).minOrNull()?.toInt()
    when {
        cups == minCups -> println("Yes, I can make that amount of coffee")
        cups > minCups!! -> println("No, I can make only $minCups cups of coffee")
        cups < minCups!! -> println("Yes, I can make that amount of coffee (and even ${minCups - cups} more than that)")
    }
}
