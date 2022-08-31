fun main(args: Array<String>) {
        var nota1:Float
        var nota2:Float

        println(VERMELHO)
        println("--------------------------------------")
        println("\t\tNOTAS ESTUDONAUTA")
        println("--------------------------------------")
        println(RESET)
        print("Nota 1: ")
        nota1 = readLine()!!.toFloatOrNull()?:0f
        print("Nota 2: ")
        nota2 = readLine()!!.toFloatOrNull()?:0f
        println(AMARELO)
        println("------------ RESULTADOS ----------------")
        println("As notas do aluno foram $nota1 e $nota2")
        println("A média final foi ${(nota1 + nota2) / 2}")
        println("----------------------------------------")
        }