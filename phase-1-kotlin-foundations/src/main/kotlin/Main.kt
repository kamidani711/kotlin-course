fun main() {
    println("Hello, Kotlin Course!")
}

fun calculateVat(amount: Double, rate: Double = 0.05): Double {
    return amount * rate
}
