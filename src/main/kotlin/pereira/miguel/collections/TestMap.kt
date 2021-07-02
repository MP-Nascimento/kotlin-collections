package pereira.miguel.collections

fun main() {
    val pair : Pair<String, Double> = Pair("Miguel", 3250.00)
    val map1 = mapOf(pair)
    map1.forEach { (k,v)-> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Diego" to 10000.00,
        "Fifo" to  8000.00
    )
    map2.forEach{(k,v)-> println("Chave: $k - Valor: $v")}
}