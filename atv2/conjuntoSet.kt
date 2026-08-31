
// conseguimos manipular os dois conjuntos A (1,2,3) e B (3,4,5)
// podendo fazer operações de uniao, intersecao, diferenca e pertencimento
fun main() {
    val A = setOf(1, 2, 3)
    val B = setOf(3, 4, 5)

    val uniao = A union B 

    val intersecao = A intersect B 

    val diferenca = A subtract B 

    val pertence = 2 in A 

    println("Uniao: $uniao")
    println("Intersecao: $intersecao")
    println("Diferenca: $diferenca")
    println("2 esta em A? $pertence")
}