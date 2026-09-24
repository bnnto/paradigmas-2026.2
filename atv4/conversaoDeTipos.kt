// CONVERSAO IMPLICITA
// nao ocorre entre tipos numericos e sao bem especificas

// 1- upcasting em hierarquia de classes (subtipo → supertipo)

val texto: String = "Olá"
val objeto: Any = texto // implícita: String é subtipo de Any
println(objeto)

// 2- concatenação de String com o operador +

val idade = 25
val mensagem = "Tenho " + idade + " anos" // Int é convertido para String implicitamente aqui
println(mensagem)

// CONVERSAO EXPLICITA
// explicitamente o Kotlin ele permite voce converter entre tipos numericos usando funcoes específicas para cada tipo primitivo, como toInt(), toLong(), toDouble(), etc.

// 1- exemplo com tipos numéricos

val inteiro: Int = 10

val longo: Long = inteiro.toLong()
val duplo: Double = inteiro.toDouble()
val flutuante: Float = inteiro.toFloat()
val curto: Short = inteiro.toShort()
val byte: Byte = inteiro.toByte()

println("$longo $duplo $flutuante $curto $byte")


// 2- conversão entre String e tipos numéricos
// aqui a conversão é feita por funções específicas, e pode falhar em tempo de execução se a string não for válida
val texto: String = "123"
val numero: Int = texto.toInt() // conversão explícita, pode lançar NumberFormatException
println(numero + 1)

// forma seliminar erros de execução:
val numeroSeguro: Int? = texto.toIntOrNull() // retorna null em vez de lançar exceção
println(numeroSeguro)

val invalido: Int? = "abc".toIntOrNull()
println(invalido) // null

// 3- cnversão de número para String

val numero: Int = 42
val texto: String = numero.toString() // explícita, sempre funciona
println(texto)

// 4- casting de tipos com as e is

val objeto: Any = "Lorenna"

// Verificação de tipo (is)
if (objeto is String) {
    println(objeto.length) // smart cast automático dentro do bloco
}

// Cast explícito (as)
val texto: String = objeto as String
println(texto.uppercase())

// Cast seguro (as?) - retorna null em vez de lançar exceção se falhar
val numero: Int? = objeto as? Int
println(numero) // null, pois objeto é String, não Int