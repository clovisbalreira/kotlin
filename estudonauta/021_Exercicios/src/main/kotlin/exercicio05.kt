fun main(args: Array<String>) {
        var salario:Float
        var reajuste:Float

        println(VERMELHO)
        println("---------------------------------")
        println("\t\tREAJUSTE SALARIAL")
        println("---------------------------------")
        println(RESET)
        print("Salário: R$ ")
        salario = readLine()!!.toFloatOrNull()?:0f
        print("Reajuste (%): ")
        reajuste = readLine()!!.toFloatOrNull()?:0f
        println(AMARELO)
        println("---------- REAJUSTANDO ----------")
        println("O salário anterior era\t R$ ${salario}")
        println("O aumento será de\t\t ${reajuste}%")
        println("E passará a ganhar\t\t R$ ${salario+(salario * reajuste/100)}${RESET}")
        println("---------------------------------")

        }
