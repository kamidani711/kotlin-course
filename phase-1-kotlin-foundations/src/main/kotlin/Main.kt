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

    println("19 is adult:${isAdult(18)}")
}

fun double(n: Int): Int = n + n
fun greet(name: String, greeting: String = "Hello"):String = greeting + " " +name

fun calculateVat(amount: Double, rate: Double = 0.05): Double = amount * rate

fun grade(score: Int): String{
    var grade = when(score){
        85 -> "A"
       75 -> "B"
       65 -> "C"
       55 -> "D"
       else -> "F"
    }
    return grade
}
fun loopTesting(){
    for (i in 1..10){
        println(i)
    }

    for (even in 1..10){
        if (even % 2 == 0){
            println(even)
        }
    }
}
fun isAdult(age: Int): Boolean = if (age >= 18 )  true else false
