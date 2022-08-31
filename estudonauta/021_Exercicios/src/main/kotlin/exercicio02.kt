fun main(args: Array<String>) {

    println(VERMELHO)
    println("------------------------------------")
    println("\t\t\tDOIS VALORES")
    println("------------------------------------")
    println(RESET)
    print("Valor 1: ")
    var valor1 = readLine()!!.toIntOrNull()?:0
    print("Valor 2: ")
    var valor2 = readLine()!!.toIntOrNull()?:0

    println(AMARELO)
    println("--------------- RESULTADOS ---------------")
    println("Soma: ${AZUL} \t\t\t ${valor1} + ${valor2} = ${AMARELO} ${valor1 + valor2}")
    println("Subtração:  ${AZUL} \t ${valor1} - ${valor2} = ${AMARELO} ${valor1 - valor2} ")
    println("Multiplicação:${AZUL}\t ${valor1} * ${valor2} = ${AMARELO} ${valor1 * valor2} ")
    println("Divisão: ${AZUL} \t\t ${valor1} / ${valor2} = ${AMARELO} ${valor1.toFloat() / valor2.toFloat()} ")
    println("Módulo: ${AZUL} \t\t ${valor1} % ${valor2} = ${AMARELO} ${valor1 % valor2} ")
    println("------------------------------------------")
}
