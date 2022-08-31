
import java.lang.Math.pow
import kotlin.math.pow
fun main(args: Array<String>) {
        var base:Int
        var expoent:Int

        println(VERMELHO)
        println("----------------------------------------")
        println("\t\t CÁCULO DE POTÊNCIA")
        println("----------------------------------------")
        println(RESET)
        print("Base: ")
        base = readLine()!!.toIntOrNull()?:0
        print("Expoênte: ")
        expoent = readLine()!!.toIntOrNull()?:0
        println(AMARELO)
        println("---------- Resultados ---------")
        println("${AMARELO}Calculando ${AZUL} $base ${AMARELO} elevado a ${AZUL} ${expoent}")
        println("${AMARELO}O resultado é ${pow(base.toDouble(), expoent.toDouble())}")
        println("-------------------------------")
        }