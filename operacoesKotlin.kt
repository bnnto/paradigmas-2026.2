fun main(){
    // tipos numericos

    // operacoes aritmeticas
    
    // definindo o tipo explicitamente
    var valor: Int = 100
    valor = valor + 20

    // compilador infere o tipo pelo valor
    val a = 10 + 5
    val b = 10 - 5
    val c = 10 * 5
    val d = 10 / 5
    val e = 10 % 3

    print("Teste valor:")
    println(" valor = $valor")

    // comparacoes
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
    println(a == b)
    println(a != b)

    // incremento e decremento

    var x = 5
    x++
    x--
    x += 1
    x -= 1
    println("valor do x: " + x)

    // operacoes bit a bit so com int e long
    val y = 5
    println("y deslocado para a esquerda por 2: " + (y shl 2))
    println("y deslocado para a direita por 2: " + (y shr 2))
    println("y deslocado sem sinal por 2: " + (y ushr 2))
    println("y com AND por 3: " + (y and 3))
    println("y com OR por 3: " + (y or 3))
    println("y com XOR por 3: " + (y xor 3))
    println("y com NOT: " + (y.inv()))

    // conversao entre tipos numericos
    val i: Int = 100
    val l: Long = i.toLong()
    val z: Double = i.toDouble()
    val m: Byte = i.toByte()
    val f: Float = i.toFloat()
    val s: Short = i.toShort()

    // boolean

    // operacoes logicas
    val verdadeiro = true
    val falso = false

    println("verdadeiro AND falso: " + (verdadeiro && falso))
    println("verdadeiro OR falso: " + (verdadeiro || falso))
    println("NOT verdadeiro: " + (!verdadeiro))  

    // comparacao
    println("verdadeiro igual a falso?: " + (verdadeiro == falso))
    println("verdadeiro diferente de falso?: " + (verdadeiro != falso))

    // bit a bit
    println("verdadeiro AND falso?: " + (verdadeiro and falso))
    println("verdadeiro OR falso?: " + (verdadeiro or falso))
    println("verdadeiro XOR falso?: " + (verdadeiro xor falso))

    // char

    // comparacao
    println("a < b: " + ('a' < 'b'))
    println("a == a: " + ('a' == 'a'))

    // deslocamento na tabela unicode        
    println("c: " + ('a' + 1))
    println("diferenca: " + ('b' - 'a'))

    val codigo: Int = 'a'.code       // pega o código Unicode
    val char: Char = 97.toChar()   // converte Int para Char
}