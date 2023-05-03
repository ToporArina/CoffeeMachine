package machine

var water = 400
var milk = 540
var beans = 120
var cups = 9
var money = 550

fun main() {
    printout()
    println()
    println("Write action (buy, fill, take):")
    when (readln()) {
        "buy" -> buy()
        "fill" -> fill()
        "take" -> take()
    }
    println()
    printout()

}

fun take() {
    println("I gave you $$money")
    money = 0
}

fun fill() {
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
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
    when (readln().toInt()) {
        1 -> {
            water -= 250
            beans -= 16
            cups -= 1
            money += 4

        }
        2 -> {
            water -= 350
            milk -= 75
            beans -= 20
            cups -= 1
            money += 7
        }
        3 -> {
            water -= 200
            milk -= 100
            beans -= 12
            cups -= 1
            money += 6
        }
    }
}

fun printout() = println(
    """
        The coffee machine has:
        $water ml of water
        $milk ml of milk
        $beans g of coffee beans
        $cups disposable cups
        $$money of money
    """.trimIndent()
)
