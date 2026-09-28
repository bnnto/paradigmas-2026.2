

// o tipo é deduzido a partir do valor de inicialização

val nome = "Lorenna" // String
var idade = 30 // Int
val preco = 19.90 // Double
val ativo = true // Boolean
val letra = 'K' // Char
val grande = 10L // Long (pelo sufixo)
val decimal = 3.14f // Float (pelo sufixo)

idade = 31 // joia
idade = "trinta" // dá erro: Type mismatch (String x Int)

// também funciona com tipos compostos e genéricos 

val lista = listOf(1, 2, 3) // List<Int>
val mapa = mapOf("a" to 1, "b" to 2) // Map<String, Int>
val pessoa = Pessoa("Bento", 30) // Pessoa
val misto = listOf(1, "dois", 3.0) // List<Any>

// inferência de tipos nulos 

val a = "oi" // String (não nulo)
val b = null // Nothing?
val c = if (true) 5 else null // Int?

// limites de inferência

// parâmetros de funções sempre têm tipo explícito
fun soma(a, b) = a + b // erro por que falta o tipo dos parâmetros

// variável sem inicializador
val x // erro por que não há de onde inferir
val y: Int // joia

// quando se quer um tipo diferente do padrão inferido
val n = 10 // Int
val m: Long = 10 // Long
val p: Any = "oi" // Any, e não String