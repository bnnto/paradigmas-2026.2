var texto = "Bento"
texto = texto + " legal!" // cria uma nova instancia
println(texto)
 
// String Builder
val sb = StringBuilder("Meu nome")
sb.append("é Lorenna.") // não cria novas instancias
println(sb.toString())
 
// Principais operações
 
// Concatenação
val a = "Apollo"
val b = "é um cachorro."
val resultado = a + " " + b
 
// Templates de String - utilizamos o "$" para acesso
val nome = "Bento Guilherme"
val idade = 20
println("Olá, $nome! Você tem $idade anos.")      
println("Ano que vem terá ${idade + 1} anos.")    
 
// Acesso de caracteres e propriedades
val palavra = "Bolo de Chocolate"
println(palavra.length)     // Tamanho
println(palavra[0])         // Primeira letra
println(palavra.uppercase()) // Tudo maiúsculo
println(palavra.lowercase()) // Tudo minúsculo
 
// Busca e verificação
val frase = "Apollo é fofo."
println(frase.contains("fofo"))     // Verifica se contém
println(frase.startsWith("Apollo")) // Verifica se começa com
println(frase.endsWith("eu"))   // Verifica se termina com
println(frase.indexOf("é"))       // Retorna o índice
 
// Conversão para outros tipos
val numeroTexto = "1611"
val numero = numeroTexto.toInt()      // Converte String para Int
val volta = numero.toString()         // converte Int para String