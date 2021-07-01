package pereira.miguel.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1500.00
    salarios[1] = 1000.00
    salarios[2] = 3570.00

    salarios.forEach { println(it) }

    println("-------------------------")

    salarios.forEachIndexed { index,salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("-------------------------")
    val salarios2 = doubleArrayOf(1500.00,1000.50,3150.00)
    salarios2.sort()
    salarios2.forEach { println(it) }

}