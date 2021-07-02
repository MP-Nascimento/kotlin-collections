package pereira.miguel.collections


fun main() {
        val joao = Funcionario("João",6000.00, "PJ")
        val pedro = Funcionario("Pedro",4000.00,"CLT")
        val miguel= Funcionario("Miguel",5000.00,"CLT")

    val funcionarios = listOf(joao,pedro,miguel)

    funcionarios.forEach { println(it) }
    println(funcionarios.find { it.nome == "Miguel" })

    println("-----------------------------------------")
    funcionarios
        .sortedBy { it.salarios }
        .forEach { println(it) }

    println("-----------------------------------------")
    funcionarios
        .groupBy { it.tipoComtrato }
        .forEach { println(it) }
}
