fun main() {
    val num = 100
    println("The Double of num is: ${double(num)}")
    val name = "Kamran"
    println(greet(name = name))
    val amount = 1500.0
    println("vat amount is: ${calculateVat(amount)}")
    println("The grade for 85 is: ${grade(85)}")
    println("The grade for 75 is: ${grade(75)}")
    println("The grade for 65 is: ${grade(65)}")
    println("The grade for 55 is: ${grade(55)}")
    println("The grade for 45 is: ${grade(45)}")

    loopTesting()

    println("18 is adult:${isAdult(18)}")
}

fun double(n: Int): Int = n + n
fun greet(name: String, greeting: String = "Hello"): String = greeting + " " + name

fun calculateVat(amount: Double, rate: Double = 0.05): Double = amount * rate

fun grade(score: Int): String = when(score) {
       in 85..100 -> "A"
       in 75..84 -> "B"
       in 65..74 -> "C"
       in 55..64 -> "D"
       else -> "F"
    }


fun loopTesting() {
    for (i in 1..10) {
        println(i)
    }

    for (even in 0..10 step 2) {
            println(even)
    }
}

fun isAdult(age: Int): Boolean = age >= 18
