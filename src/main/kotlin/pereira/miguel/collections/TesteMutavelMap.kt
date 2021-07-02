package pereira.miguel.collections

fun main() {
    val joao = Funcionario("João",6000.00, "PJ")
    val pedro = Funcionario("Pedro",4000.00,"CLT")
    val miguel= Funcionario("Miguel",5000.00,"CLT")

    val repositorio=Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(miguel.nome, miguel)

    println(repositorio.findById(joao.nome))

    println("----------------------------")
    repositorio.findAll().forEach{ println(it)}

    println("----------------------------")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach{ println(it)}
}