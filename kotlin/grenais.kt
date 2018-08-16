import java.util.Scanner
class Time(var nome:String){
    var vitorias:Int=0
    var empates:Int=0
    override fun toString():String{
        return "$nome:$vitorias"
    }
}
fun main(args: Array<String>) {
    val gremio=Time("Gremio")
    val inter=Time("Inter")
    var opcao:Int=1
    var golsGremio:Int
    var golsInter:Int
    val scanner=Scanner(System.`in`)
    while(opcao==1){
        golsInter=scanner.nextInt()
        golsGremio=scanner.nextInt()
        if(golsInter>golsGremio)
            inter.vitorias++
        else if(golsGremio>golsInter)
            gremio.vitorias++
        else
            inter.empates++
        println("Novo grenal (1-sim 2-nao)")
        opcao=scanner.nextInt()
        if(opcao==2){
            println("${gremio.vitorias+inter.vitorias+inter.empates} grenais")
            println("$inter")
            println("$gremio")
            println("Empates:${inter.empates}")
            if(inter.vitorias>gremio.vitorias)
                println("Inter venceu mais")
            else if(inter.vitorias<gremio.vitorias)
                println("Gremio venceu mais")
            else
                println("Não houve vencedor")
        }
    }
}