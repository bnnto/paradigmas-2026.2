// Cast com as

val x: Any = "texto"
val n = x as Int      // compila, mas lança ClassCastException ao executar
val m = x as? Int     // cast seguro: devolve null em vez de exceção

// O compilador aceita, pois Any pode ser qualquer coisa. Quem confere o tipo real é a JVM, na hora da execução.

// Teste de tipo com is

fun descrever(x: Any) = when (x) {
    is Int -> "inteiro"
    is String -> "texto"
    else -> "outro"
}

// O is consulta o tipo real do objeto em tempo de execução. O que acontece depois (smart cast) é estático, mas o teste em si é dinâmico.

// Checagem de null em execução

val s: String? = null
println(s!!.length)   // NullPointerException ao executar

// O !! diz ao compilador "confie em mim". Se você errar, a checagem falha em tempo de execução. O mesmo vale para requireNotNull() e checkNotNull().