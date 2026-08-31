
val numeros = arrayOf(10, 20, 30, 40)

// as funções de mapeamento get/set são funções sobrecarregadas
println(numeros[2])   // chama numeros.get(2) → 30

numeros[1] = 99        // chama numeros.set(1, 99)

// array generico
// valores ficam boxed = + custo de desempenho
val nomes: Array<String> = arrayOf("Ana", "Bruno", "Carla")
val misto: Array<Any> = arrayOf(1, "dois", 3.0)

// arrays unboxed (especializados para cada tipo primitivo)

val idades: IntArray = intArrayOf(20, 22, 13)
val zeros: DoubleArray = DoubleArray(4) { 0.0 }   // ficaria assim _> [0.0, 0.0, 0.0, 0.0]
val bits: BooleanArray = booleanArrayOf(true, false, false)
// outros tipos que não estão aqui: FloatArray, LongArray, ShortArray
// ByteArray e CharArray

// arrays multidimensionais 

val matriz: Array<IntArray> = Array(3) { IntArray(3) }  // matriz 3x3 de zeros

matriz[0][0] = 1
matriz[1][2] = 5