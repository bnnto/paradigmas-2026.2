fun main() {
    // verificacao de pertencimento com in
    val notasAprovacao = 6.0..10.0
    val notaAluno = 6.1

    if (notaAluno in notasAprovacao) {
        println("Aluno aprovado!")
    }

    // contagem crescente com for
    print("contagem crescente: ")
    for (i in 1..5) {
        print("$i ")
    }
    println()

    // intervalo aberto a direita com until
    print("Índices de 0 a 9: ")
    for (i in 0 until 10) {
        print("$i ") 
    }
    println()

    // intervalo decrescente com downto
    print("regressao em pares: ")
    for (i in 10 downTo 0 step 2) {
        print("$i ")
    }
    println()

    // intervalo mas com caracteres
    val letrasMinusculas = 'a'..'z'
    println("A letra 'G' é minúscula? ${'G' in letrasMinusculas}")
}