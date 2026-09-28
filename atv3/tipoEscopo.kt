// a função usa a variável de onde foi declarada

val x = 10                  // variável de nível superior

fun mostrar() {
    println(x)              // sempre usa o x de nível superior
}

fun teste() {
    val x = 99              // x local de teste()
    mostrar()               // mostrar() NÃO enxerga este x
}

fun main() {
    teste()                 // imprime 10
}

// o mesmo nome, resultados diferentes conforme o local de escrita

fun main() {
    val nome = "Bento"

    fun saudar() {
        println("Oi, $nome") // 'nome' vem do bloco onde saudar() foi escrita
    }

    fun outraFuncao() {
        val nome = "Lorenna"
        // saudar() não pode ser chamada aqui, e mesmo se pudesse,
        // usaria "Bento", não "Lorenna"
    }

    saudar() // Oi, Bento
}

// classes seguem o mesmo princípio

class Caixa {
    val valor = "da Caixa"

    fun mostrar() {
        println(valor) // sempre a propriedade desta classe
    }
}

fun main() {
    val valor = "de main"
    Caixa().mostrar() // da Caixa
}