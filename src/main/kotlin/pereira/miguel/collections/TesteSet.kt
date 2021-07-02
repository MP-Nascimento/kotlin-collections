package pereira.miguel.collections

fun main() {
    val joao = Funcionario("João",6000.00, "PJ")
    val pedro = Funcionario("Pedro",4000.00,"CLT")
    val miguel= Funcionario("Miguel",5000.00,"CLT")

    val  funcionarios1 = setOf(joao,pedro)
    val  funcionarios2 = setOf(miguel)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it.toString() ) }

    println("------------------")

    val funcionario3 = setOf(joao,pedro, miguel)
    val resultSubtract = funcionario3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }
    println("------------------")

    val funcionario4 = setOf(joao,pedro, miguel)
    val resultIntersect = funcionario4.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}