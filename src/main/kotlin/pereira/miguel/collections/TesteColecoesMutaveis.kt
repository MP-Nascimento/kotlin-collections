package pereira.miguel.collections

fun main() {
    val joao = Funcionario("João",6000.00, "PJ")
    val pedro = Funcionario("Pedro",4000.00,"CLT")
    val miguel= Funcionario("Miguel",5000.00,"CLT")

    println("-------- List --------")
    val funcionarios = mutableListOf(joao,miguel)
    funcionarios.forEach{ println(it)}
    println("-----------------")
    funcionarios.add(pedro)
    funcionarios.forEach{ println(it)}

    println("-----------------")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it)}



    println("-------- Set --------")
    val  funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach{ println(it)}

    println("-----------------")

    funcionarioSet.add(pedro)
    funcionarioSet.add(miguel)
    funcionarioSet.forEach{ println(it)}

    println("-----------------")
    funcionarioSet.remove(miguel)
    funcionarioSet.forEach{ println(it)}
}