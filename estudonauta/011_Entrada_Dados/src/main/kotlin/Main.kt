fun main(args: Array<String>) {
    print("Qual o Seu nome: ")
    val nome:String = readLine()!!
    print("Quantos anos Você tem, $nome: ")
    val idade:Int = readLine()!!.toInt()
    print("Finalizando, $nome tem $idade anos de idade")
}