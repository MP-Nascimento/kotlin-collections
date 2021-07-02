package pereira.miguel.collections

fun main() {
    val salarios = doubleArrayOf(1500.00,1000.00,3250.00)
    salarios.forEach { println(it) }
    println("-------------------------------------------")
    println("Maior salario é ${salarios.maxOrNull()}")
    println("Menor salario é ${salarios.minOrNull()}")
    println("A media de salario é ${salarios.average()}")
    println("-------------------------------------------")


    val salarioMaiorque2500  = salarios.filter { it > 2500 }
    salarioMaiorque2500.forEach{ println("Os Salarios Maiores que 2500 são: $it")}

    println("-------------------------------------------")
    println(salarios.count { it in 2500.00..5000.00 })

    println("-------------------------------------------")
    println(salarios.find { it == 1500.00 })

    println("-------------------------------------------")
    println(salarios.any { it == 1500.00 })
}