// val cria uma variável que só recebe valor uma vez. Depois disso, não dá mais para trocar.
fun main() {
    val nome = "Maria"
    println(nome) // Maria

    nome = "Ana" // ERRO: não pode trocar o valor de um val
}

// const val é a constante nomeada propriamente dita. 
// O valor é conhecido na compilação e substituído diretamente no bytecode

const val NUMERO_ALEAT = 1.2345
const val APP_NAME = "AplicativoDeLorennaEBento"
const val MAX_TENTATIVAS = 3

fun main() {
    println("$APP_NAME tenta até $MAX_TENTATIVAS vezes")
}

// Regras de val

// Só aceita tipos primitivos e String (Int, Double, Boolean, Char, etc.).
// O valor deve ser um literal ou uma expressão calculável em compilação.
// Só pode ser declarada no nível superior, dentro de um object ou dentro de um companion object.
// Não pode ter getter customizado nem ser var.

///////////////

// Constantes dentro de object e companion object

object Config {
    const val URL_BASE = "https://api.exemplo.com"
    const val TIMEOUT = 30
}

class Usuario {
    companion object {
        const val IDADE_MINIMA = 18
    }
}

fun main() {
    println(Config.URL_BASE)
    println(Usuario.IDADE_MINIMA)
}

// Enum Class conjunto de constantes nomeadas
// Quando as constantes formam um grupo fechado de valores relacionados, usa-se enum

enum class Cor {
    VERMELHO,
    VERDE,
    AZUL
}

fun main() {
    val minhaCor = Cor.VERDE
    println(minhaCor) // VERDE
}