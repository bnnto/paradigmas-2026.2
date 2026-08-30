@JvmInline
value class Metros(val valor: Double)

fun main() {
    val altura = Metros(1.75)
    println(altura.valor)
}

// Metros é um tipo que é apenas um double, mas o compilador obriga a usar ele como um tipo próprio.