data class Pessoa(var nome: String)

fun main() {
    val p1 = Pessoa("Bento")
    val p2 = p1        
    p2.nome = "Lorenna"
    println(p1.nome)   

    // aqui p2 = p1 copia a referencia, não o objeto,
    // por isso p1.nome imprime Lorenna, já que p1 e p2 apontam para o mesmo objeto

    // as operacoes possiveis com referencias são
    // - verificar se duas referencias apontam pro mesmo objeto (===)
    // - comparacao de igualdade (==)
    // - verificacao de nulidade (?, ?., ?:, !!)

    val a = Pessoa("Meneses")
    val b = Pessoa("Meneses")
    val c = a 

    println(a == b) // true - mesmo conteudo
    println(a === b) // falso - aqui são objetos diferentes na memoria
    println(a === c) // true - mesma referencia

    var apelido: String? = null

    println(apelido?.length) // null, mas nao quebra nada
    println(apelido?.length ?: 0) // usa 0 se for null
    apelido = "Lore"
    println(apelido!!.length) // força o acesso, já sabendo que nao é null
}