// estáticas

class Conta {
    companion object {
        var proximoId = 1 // compartilhada por todas as instâncias
        fun novoId() = proximoId++
    }
}

// stack-dinamicas

fun calcular(a: Int, b: Int): Int { // a e b: stack-dinâmicas
    val soma = a + b // soma: alocada na pilha ao executar esta linha
    var dobro = soma * 2 // idem
    return dobro // ao retornar, o registro de ativação é desempilhado e a, b, soma, dobro deixam de existir
} 

// heap-dinamicas

class Pessoa(val nome: String, var idade: Int)

fun main() {
    val p = Pessoa("Lorenna", 22) // "p" (referência) está na pilha
    // o objeto Pessoa está no heap
    val lista = mutableListOf(1, 2, 3) // objeto ArrayList no heap
    val vetor = IntArray(5) // array no heap
}

// explicitas ou implicitas

val a = Pessoa("Bento", 20) // explícita: chamada de construtor
val b = arrayOf("x", "y") // explícita: criação de array
val c = listOf(1, 2, 3) // explícita: função de criação de coleção

// desalocacao de variáveis

class Pessoa(val nome: String)

fun main() {
    var p: Pessoa? = Pessoa("Lorenna")   // objeto criado no heap, referenciado por "p"
    println(p?.nome)

    p = null    // a referência é removida: o objeto "Lorenna" fica inalcançável, portanto agora ele é elegível para coleta
}