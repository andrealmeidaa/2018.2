fun main(args: Array<String>) {
    val cedulas:IntArray=intArrayOf(100,50,20,10,5,2,1)
    var dinheiro=readLine()!!.toInt()
    println(dinheiro)
    var qtdNota:Int
    cedulas.forEach{
        qtdNota=dinheiro.div(it)
        dinheiro-=(qtdNota*it) 
        println("$qtdNota nota(s) de R$ $it,00")
    }
}