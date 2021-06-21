package pereira.miguel.collections

fun main() {
    val values = intArrayOf(0,903,2,4,5)

    values.forEach {
        println(it)
    }
    println("-------------------------------------")
    values.sort()
    values.forEach {
        println(it)
    }
}