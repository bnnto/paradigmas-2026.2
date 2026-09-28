

// declaracao de variáveis 
val nome: String = "Lorenna" // imutável
var contador: Int = 0 // mutável

contador = contador + 1 // OK
nome = "Bento" // dá erro: Val cannot be reassigned

total = 10 // dá erro: Unresolved reference: total (a variável total não foi declarada)

// declaracao implicita e explicita
// explicitas
val nome: String = "Lorenna"
var preco: Double = 19.90
val ativo: Boolean = true

// implicita do tipo 
// aqui o compilador infere a partir do valor inicial
val nome = "Bento" // inferido como String
var preco = 19.90 // inferido como Double

preco = 25.50 // OK: continua sendo Double
preco = "barato" // erro: o tipo já foi fixado como Double

// o tipo pode ser obrigatorio caso nao tenha valor inicial para o compilador inferir o tipo
val resultado: Int // tipo explícito obrigatório
resultado = 42 // atribuição posterior, uma única vez