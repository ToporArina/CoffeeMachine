package machine

import kotlin.system.exitProcess

var water = 400
var milk = 540
var beans = 120
var cups = 9
var money = 550

fun main() {
    while (true) {
        println("Write action (buy, fill, take, remaining, exit):")
        when (readln()) {
            "buy" -> buy()
            "fill" -> fill()
            "take" -> take()
            "remaining" -> remaining()
            "exit" -> exitProcess(0)
        }
        println()
    }
}

fun take() {
    println()
    println("I gave you $$money")
    money = 0
}

fun fill() {
    println()
    println("Write how many ml of water you want to add:")
    water += readln().toInt()
    println("Write how many ml of milk you want to add: ")
    milk += readln().toInt()
    println("Write how many grams of coffee beans you want to add: ")
    beans += readln().toInt()
    println("Write how many disposable cups you want to add: ")
    cups += readln().toInt()
}

fun buy() {
    println()
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
    when (readln()) {
        "1" -> {
            when {
                water - 250 < 0 -> {
                    println("Sorry, not enough water!")
                    return
                }
                beans - 16 < 0 -> {
                    println("Sorry, not enough coffee beans!")
                    return
                }
                cups - 1 < 0 -> {
                    println("Sorry, not enough cups!")
                    return
                }
            }
            water -= 250
            beans -= 16
            cups -= 1
            money += 4

        }
        "2" -> {
            when {
                water - 350 < 0 -> {
                    println("Sorry, not enough water!")
                    return
                }
                milk - 75 < 0 -> {
                    println("Sorry, not enough milk!")
                    return
                }
                beans - 20 < 0 -> {
                    println("Sorry, not enough coffee beans!")
                    return
                }
                cups - 1 < 0 -> {
                    println("Sorry, not enough cups!")
                    return
                }
            }
            water -= 350
            milk -= 75
            beans -= 20
            cups -= 1
            money += 7
        }
        "3" -> {
            when {
                water - 200 < 0 -> {
                    println("Sorry, not enough water!")
                    return
                }
                milk - 100 < 0 -> {
                    println("Sorry, not enough milk!")
                    return
                }
                beans - 12 < 0 -> {
                    println("Sorry, not enough coffee beans!")
                    return
                }
                cups - 1 < 0 -> {
                    println("Sorry, not enough cups!")
                    return
                }
            }
            water -= 200
            milk -= 100
            beans -= 12
            cups -= 1
            money += 6
        }
        "back" -> return
    }
    println("I have enough resources, making you a coffee!")
}

fun remaining() = println(
    """
        
        The coffee machine has:
        $water ml of water
        $milk ml of milk
        $beans g of coffee beans
        $cups disposable cups
        $$money of money
    """.trimIndent()
)
