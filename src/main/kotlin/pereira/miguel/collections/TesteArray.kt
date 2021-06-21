package pereira.miguel.collections

fun main() {
    val nomes = Array(3) { "" }

    nomes[0] = "Miguel"
    nomes[1] = "Caramelo"
    nomes[2] = "Diego"

    nomes.sort()
    for (nome in nomes) {

        println(nome)
    }
    println("-------------------")

    val namesOf = arrayOf("Amendoim", "Felipe", "Pig")
    namesOf.sort()
    namesOf.forEach { println(it) }

}