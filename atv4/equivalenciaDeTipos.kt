// Classes: equivalência por nome

class Ponto(val x: Int, val y: Int)
class Coord(val x: Int, val y: Int)

val p: Ponto = Coord(1, 2)   // ERRO: mesma estrutura, mas nomes diferentes

// Mesmo com campos idênticos, Ponto e Coord são tipos distintos.

// Value classes: tipos distintos mesmo sobre o mesmo dado

@JvmInline value class Metros(val v: Double)
@JvmInline value class Segundos(val v: Double)

fun andar(d: Metros) {}
andar(Segundos(2.0))         // ERRO: nomes diferentes, apesar de ambos serem Double

// Typealias: apelido, não tipo novo

typealias Nome = String

val n: Nome = "Lorenna"
val s: String = n            // OK: Nome e String são o mesmo tipo

// O typealias só dá outro nome ao tipo existente, então os dois são intercambiáveis. Por isso ele não serve para criar tipos distintos.

// Tipos função: equivalência estrutural

val soma: (Int, Int) -> Int = { a, b -> a + b }
val mult: (Int, Int) -> Int = { a, b -> a * b }

fun aplicar(f: (Int, Int) -> Int) = f(2, 3)
aplicar(soma)                // OK
aplicar(mult)                // OK

// Aqui não há nome declarado. Qualquer função com os mesmos tipos de parâmetros e de retorno é equivalente.