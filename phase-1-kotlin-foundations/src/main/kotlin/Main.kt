fun main() {
    val num = 100
    println("The Double of num is: ${double(num)}")
    val name = "Kamran"
    println(greet(name = name))
    val amount = 1500.0
    println("vat amount is: ${calculateVat(amount)}")
}

fun double(n: Int): Int = n + n
fun greet(name: String, greeting: String = "Hello"):String = greeting + " " +name

fun calculateVat(amount: Double, rate: Double = 0.05): Double = amount * rate