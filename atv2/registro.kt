
data class Pessoa(val nome: String, val idade: Int, val email: String)

fun main() {
    val p1 = Pessoa("Lorena", 22, "lorenna@exemplo.com")

    // Acesso nomeado
    println(p1.nome)
    println(p1.idade)

    // Desestruturação
    val (nome, idade, email) = p1
    println("$nome tem $idade anos")

    // Igualdade por valor (não por referência)
    val p2 = Pessoa("Lorenna", 22, "lorenna@exemplo.com")
    println(p1 == p2)

    // Cópia com alteração parcial de campos
    val p3 = p1.copy(idade = 23)
    println(p3)
}