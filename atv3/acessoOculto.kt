// this: propriedade da própria classe
// Quando um parâmetro ou variável local tem o mesmo nome de uma propriedade da classe, this.nome acessa a propriedade.

class Pessoa(val nome: String) {
    fun apresentar(nome: String) {
        println(nome) // o parâmetro
        println(this.nome) // a propriedade da classe
    }
}

fun main() {
    val p = Pessoa("Maria")
    p.apresentar("Ana")
    // Ana
    // Maria
}

// this@NomeDaClasse: classe externa
// Numa classe interna, this@Externa acessa os membros da classe externa, 
// mesmo que a interna tenha uma propriedade com o mesmo nome.

class Externa {
    val x = "x da Externa"

    inner class Interna {
        val x = "x da Interna"

        fun mostrar() {
            println(x) // x da Interna (a mais próxima)
            println(this.x) // x da Interna
            println(this@Externa.x) // x da Externa (a oculta)
        }
    }
}

fun main() {
    Externa().Interna().mostrar()
}

// Nome qualificado: variável de nível superior
// Uma variável declarada fora de qualquer função pode ser acessada pelo nome do pacote, 
// mesmo que uma variável local a esconda.

package meuapp

val contador = 100 // variável de nível superior

fun main() {
    val contador = 1 // esconde a de nível superior

    println(contador) // 1
    println(meuapp.contador) // 100
}

// NomeDaClasse.membro: objetos e companion objects
// Membros de object e companion object são acessados pelo nome da classe ou do objeto.

object Config {
    val limite = 50
}

fun main() {
    val limite = 5

    println(limite) // 5
    println(Config.limite) // 50
}

// Variáveis locais: sem acesso
// Se uma variável local esconde outra variável local de um bloco externo, 
// não há como acessar a escondida. O compilador apenas emite um aviso.

fun main() {
    val x = 10

    if (true) {
        val x = 20  // aviso: name shadowed
        println(x)  // 20
        // não existe como acessar o x = 10 aqui
    }
}