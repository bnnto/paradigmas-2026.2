// array: elementos mutáveis, tamanho fixo
val vet = intArrayOf(1, 2, 3)
vet[0] = 10 // atualização parcial

// mutableList
val lista = mutableListOf(1, 2, 3)
lista[1] = 20 // parcial
lista.add(4) // altera a estrutura

// Objeto: campos var
class Ponto(var x: Int, var y: Int)
val p = Ponto(1, 2)
p.x = 5 // parcial (campo)

// atualizacao total

// reatribuição da referência

var lista = listOf(1, 2, 3)
lista = listOf(7, 8, 9) // atualização total: nova lista inteira
println(lista) // [7, 8, 9]

var vet = intArrayOf(1, 2, 3)
vet = intArrayOf(4, 5, 6) // total, via nova referência

// sobrescrita do conteúdo, mantendo o mesmo objeto

// Arrays
val vet = IntArray(3)
vet.fill(0) // todos os elementos = 0
intArrayOf(7, 8, 9).copyInto(vet) // copia o conteúdo para vet
println(vet.toList()) // [7, 8, 9]

// MutableList
val lista = mutableListOf(1, 2, 3)
lista.clear()
lista.addAll(listOf(4, 5, 6)) // substitui o conteúdo inteiro
lista.replaceAll { it * 2 } // atualiza todos os elementos
println(lista) // [8, 10, 12]

// objetos: data class e copy()

data class Ponto(val x: Int, val y: Int)

var p = Ponto(1, 2)
p = Ponto(5, 6) // atualização total: novo objeto completo
p = p.copy(y = 10) // novo objeto, alterando só y (imutável)
println(p) // Ponto(x=5, y=10)