import java.lang.Math.random
import kotlin.math.absoluteValue

fun main(args: Array<String>) {
        var palpite:Int
        var numPensado:Int = (0..5).random()
        var diferenca:Int

        println(VERMELHO)
        println("------------------------------------")
        println("\t\tTENTE ADIVINHAR")
        println("------------------------------------")
        println(AZUL)
        println("Vou \"Pensar\" em um número entre 0 e 5${RESET}")
        print("O seu palpite : ")
        palpite = readLine()!!.toIntOrNull()?:0

        diferenca = (palpite - numPensado).absoluteValue

        println(AMARELO)
        println("------------- RESULTADOS -------------")
        println("Você disse que seria o valor${AZUL} ${palpite}")
        println("${AMARELO}Eu pensei no número ${numPensado}")
        println("${AMARELO}A diferença foi de ${MAGENTA}${diferenca}")
        println("${AMARELO}--------------------------------------")
        }
