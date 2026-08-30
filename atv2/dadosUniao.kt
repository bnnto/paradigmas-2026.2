// cada subtipo (successo, erro e carregando) representam uma variante possivel do tipo resultado
sealed class Resultado{
    data class Sucesso(val dados: String, val codigo: Int) : Resultado()
    data class Erro(val mensagem: String) : Resultado()
    object Carregando : Resultado()
}

fun processar(resultado: Resultado) {
    when (resultado) {
        is Resultado.Sucesso -> {
            // compilador sabe que o resultado é sucesso
            // e ai voce pode acessar os campos diretamente
            println(resultado.dados)
            println(resultado.codigo)
        }
        is Resultado.Erro -> println(resultado.mensagem)
        is Resultado.Carregando -> println("Carregando...")
    }
}