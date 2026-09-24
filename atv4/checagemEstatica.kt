// Compatibilidade de tipos e sem conversão implícita

val idade: Int = "vinte e dois"   // ERRO: String não é Int
val a: Int = 5
val b: Long = a            // ERRO: Kotlin não converte Int → Long sozinho
val c: Long = a.toLong()   // OK, conversão explícita

// O compilador compara o tipo declarado com o tipo do valor e barra o que não bate.

// Null safety (a mais famosa)

var nome: String = "Bento"
nome = null                // ERRO: String não aceita null

var apelido: String? = "Bentinho"
println(apelido.length)    // ERRO: pode ser null
println(apelido?.length)   // OK: chamada segura

// String e String? são tipos diferentes. Isso evita em tempo de compilação o clássico NullPointerException.

// Smart cast

fun tamanho(x: Any): Int {
    if (x is String) {
        return x.length    // aqui o compilador já sabe que x é String
    }
    return 0
}

// Depois de um is, o compilador "promove" o tipo automaticamente dentro do bloco.