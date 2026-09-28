// Exemplo padrão de blocos delimitados por chaves
fun main() {
    val idade = 20

    if (idade >= 18) {
        println("Maior de idade")
    }
}

// Blocos aninhados

fun main() {
    for (i in 1..5) {
        if (i % 2 == 0) {
            println("$i é par")
        } else {
            println("$i é ímpar")
        }
    }
}

// Escopo em blocos aninhados
// Um bloco interno enxerga as variáveis dos blocos externos, mas o contrário não acontece.

fun main() {
    val externa = "de fora"

    if (true) {
        val interna = "de dentro"
        println(externa) // OK: o bloco interno enxerga a externa
        println(interna) // OK
    }

    // println(interna) // ERRO: o bloco externo não enxerga a interna
}

// Função dentro de função 
// Kotlin também permite declarar funções locais, ou seja, um bloco de função dentro de outro:
fun main() {
    val base = 10

    fun somarBase(x: Int): Int {
        return x + base // enxerga 'base' do bloco externo
    }

    println(somarBase(5)) // 15
}