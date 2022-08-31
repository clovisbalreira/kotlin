
import java.time.LocalDateTime

fun main(args: Array<String>) {
        var anoNascimento:Int

        var dataAtual = LocalDateTime.now()

        println(VERMELHO)
        println("------------------------------")
        println("\t\tSUA IDADE")
        println("------------------------------")
        println(AZUL)
        println("Vou conseguir descobrir a sua idade")
        println(RESET)
        print("Em que ano você nasceu? ")
        anoNascimento = readLine()!!.toIntOrNull()?:0

        println(AMARELO)
        println("----------- RESULTADOS -----------")
        println("Atualmente estamos em ${dataAtual.year}")
        println("você, que nasceu em ${anoNascimento}")
        println("Completa ${AZUL}${dataAtual.year - anoNascimento} anos ${AMARELO}nesse ano.")
        println("----------------------------------")
        }
