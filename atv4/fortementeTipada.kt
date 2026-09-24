
// não há conversão implícita entre tipos numéricos
val inteiro: Int = 10
val longo: Long = inteiro // erro de compilação!

val longoCorreto: Long = inteiro.toLong() // correto: conversão explícita
println(longoCorreto)


// não há coerção automática entre tipos "diferentes"
val numero = 5
val texto = "5"
// if (numero == texto) { }  // erro: Operator '==' cannot be applied to 'Int' and 'String'


// Null Safety reforça a tipagem forte
var nome: String = "Bento"
// nome = null // erro de compilação: Null can not be a value of a non-null type String

var nomeAnulavel: String? = "Bento"
nomeAnulavel = null // OK, pois o tipo permite null
// portanto, Kotlin distingue tipos anuláveis (String?) de não anuláveis (String), evitando o NullPointerException

 
// inferência de tipos não é o mesmo que tipagem fraca
var valor = 10       // inferido como Int
// valor = "texto"   // ERRO: tipo já fixado como Int