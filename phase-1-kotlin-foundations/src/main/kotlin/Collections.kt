fun main() {
    val list: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    println(list)
    println(list[0])
    println(list.get(2))
    println(list.size)

    val mutableList: MutableList<String> = mutableListOf("Pakistan", "India", "UAE")
    println(mutableList)
    println(mutableList.first())
    println(mutableList.last())
    println(mutableList.get(0))
    println(mutableList[2])

    mutableList.add("Bangladesh")
    println(mutableList)
    mutableList.remove("India")
    println(mutableList)
    mutableList[0] = "Kenya"
    println(mutableList)
    val set: Set<Int> = setOf(1, 2, 3, 4, 5, 5)
    println(set)
    println(set.size)
    println(set.first())
    println(set.last())

    val map: Map<String, Int> = mapOf("Kamran" to 22, "Alice" to 32, "Bob" to 55)
    println(map)
    println(map.get("Kamran"))
    println(map.values)
    println(map.keys)
    println(map["Alice"])
    println(map["Pakistan"])
    for ((key, value) in map) {
        println("Key is $key and value is $value")
    }


 val m = mutableListOf(0)
m.add(2)
println(m)

 var l = listOf<Int>(1)
 l = listOf(2)
 println(l)

 val age: Int? = map["Kamran"]
 println(age)
}