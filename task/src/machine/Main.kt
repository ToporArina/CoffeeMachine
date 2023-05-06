package machine

import kotlin.system.exitProcess

fun main() {
    val coffeeMaker = CoffeeMaker()
    while (true) {
        println("Write action (buy, fill, take, remaining, exit):")
        when (readln()) {
            "buy" -> coffeeMaker.buy()
            "fill" -> coffeeMaker.fill()
            "take" -> coffeeMaker.take()
            "remaining" -> coffeeMaker.remaining()
            "exit" -> exitProcess(0)
        }
        println()
    }
}

