import java.time.LocalDateTime

fun main(args: Array<String>) {
        var dataAtual = LocalDateTime.now()

        println(VERMELHO)
        println("----------------------------------------")
        println("\tANALISANDO O MÊS ATUAL")
        println("----------------------------------------")
        println("${AMARELO}Estamos no mês ${AZUL}${dataAtual.monthValue} de ${dataAtual.year} ")
        println("${AMARELO}Esse mês está no ${AZUL}${((dataAtual.monthValue - 1) / 6) + 1}º semestre ")
        println("${ AMARELO}E pertence ao ${AZUL}${((dataAtual.monthValue - 1) / 3) + 1}º trimestre ")
        println("${AMARELO}---------------------------------------- ")
        }
