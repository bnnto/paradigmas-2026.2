open class Animal(val nome: String) {
    open fun emitirSom() {
        println("$nome faz algum som")
    }
}

class Cavalo(nome: String) : Animal(nome) {
    override fun emitirSom() {
        println("$nome galopa: pocotó, pocotó")
    }
}

class Gato(nome: String) : Animal(nome) {
    override fun emitirSom() {
        println("$nome mia: miau")
    }
}

interface Voador {
    fun voar()
}

// aqui a classe tem multiplos supertipos, uma classe e várias interfaces
class Passaro(nome: String) : Animal(nome), Voador {
    override fun emitirSom() = println("$nome piu piu")
    override fun voar() = println("$nome voa")
}

fun main() {
    // o cavalo e o gato sao subtipos de animal
    val animal1: Animal = Cavalo("Bentorenna")   // atribuicao de subtipo a variavel do supertipo
    val animal2: Animal = Gato("Timbó")

    animal1.emitirSom()
    animal2.emitirSom()
    
    println("---")

    val Arara: Animal = Passaro("Piu")
    Arara.emitirSom()

    val Corvo: Voador = Passaro("Piu")
    Corvo.voar()
}