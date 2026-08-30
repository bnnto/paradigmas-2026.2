enum class Tamanho(val litros: Int) {
    PEQUENO(1),
    MEDIO(2),
    GRANDE(3)
}

enum class DiaDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}

// Usando when
fun tipoDia(dia: DiaDaSemana): String = when (dia) {
    DiaDaSemana.SABADO, DiaDaSemana.DOMINGO -> "Fim de semana"
    else -> "Dia útil"
}

fun main(){
    val dia = DiaDaSemana.SABADO

    // Comparacao e igualdade
    if (dia == DiaDaSemana.SABADO || dia == DiaDaSemana.DOMINGO) {
        println("É fim de semana.")
    }

    println(tipoDia(dia))

    // Propriedades automaticas
    val outroDia = DiaDaSemana.QUINTA
    println(outroDia.name)    
    println(outroDia.ordinal)

    // Funcoes estaticas
    for (d in DiaDaSemana.entries) {
        println(d)
    }

    val convertido = DiaDaSemana.valueOf("SEXTA")
    println(convertido) 

    // print do enum com construtor e propriedades
    println(Tamanho.MEDIO.litros)
}