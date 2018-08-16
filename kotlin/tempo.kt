fun main(args: Array<String>) {
    /*
    Operador !!
    A linguagem Kotlin que usa o princípio Null Safety,
    para evitar problemas de NullPointer Exception
    Exitem diversos  operadores para realizar esse teste
    O operador !! sobrescreve a checagem, permitindo
    converter o conteúdo do Readline em inteiro
    Referência: https://kotlinlang.org/docs/reference/null-safety.html
     */
    val distancia=readLine()!!.toInt() 
    println("$distancia*2} minutos")
}