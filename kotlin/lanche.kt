import java.util.Scanner
//https://www.urionlinejudge.com.br/judge/pt/problems/view/1038
fun main(args: Array<String>) {
    val precos:DoubleArray=doubleArrayOf(4.00,4.5,5.0,2.0,1.5)
    val scanner=Scanner(System.`in`)
    //O uso de `in` foi para evitar o compilador se confundir com a palavra reservada in do Kotlin
    val item:Int=scanner.nextInt()
    val quantidade:Int=scanner.nextInt()
    val valorTotal:Double=quantidade*precos[item-1]
    val resultado:String="Total: R$ %.2f".format(valorTotal)
    println(resultado)
}