fun main(args: Array<String>) {
    println("Operatores aritmeticos")
    val n1:Int = 5
    val n2:Int = 2
    println("Adição: ")
    println("$n1 + $n2 = ${n1.plus(n2)}")
    println("Subtração: ")
    println("$n1 - $n2 = ${n1.minus(n2)}")
    println("Multiplicação: ")
    println("$n1 X $n2 = ${n1.times(n2)}")
    println("Divisão: ")
    println("$n1 / $n2 = ${n1.div(n2.toFloat())}")
    println("Modulo: ")
    println("$n1 % $n2 = ${n1.mod(n2)}")
    println("$n1 % $n2 = ${n1.rem(n2)}")
}