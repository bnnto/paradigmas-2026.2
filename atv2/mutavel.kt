
fun main() {
    val x = 10

    // conseguimos simular alteração de valor por referência,
    // utilizando objetos mutáveis
    class Caixa(var valor: Int)

    val caixaX = Caixa(x)
    fun incrementar(c: Caixa) {
        c.valor++   // é possível, pois estamos mutando o objeto,
                    // e não fazendo aritmética sobre um endereço
    }

    incrementar(caixaX)
    println(caixaX.valor)
}