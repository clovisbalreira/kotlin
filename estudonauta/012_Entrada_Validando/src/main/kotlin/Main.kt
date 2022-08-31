fun main(args: Array<String>) {
    print("Qual o Seu nome: ")
    val nome:String = readLine()!!
    print("Quantos anos Você tem, $nome: ")
    val idade:Int = readLine()!!.toIntOrNull()?:0
    println("Finalizando, $nome tem $idade anos de idade")
    println("Digite um valor: ")
    val n1:Int = readLine()!!.toIntOrNull()?:0
    println("Digite outro valor: ")
    val n2:Int = readLine()!!.toIntOrNull()?:0
    println("A soma de $n1 + $n2 = ${n1+n2}")
}
