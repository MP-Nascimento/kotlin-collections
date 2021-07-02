package pereira.miguel.collections

data class Funcionario(
    val  nome :String,
    val  salarios:Double,
    val tipoComtrato :String
)
{
    override fun toString(): String =
        """
            Nome: $nome
            Salario:$salarios
        """.trimIndent()

}