fun main(args: Array<String>) {
    var nome:String? // safe call
    nome = null
    println(nome)
    var nome1:String
    nome1 = nome?:"Não" // elvis operator se o nome for nulo recebe não

    var nome2:String
    try {
        nome2 = nome!! // null checks precisa de tratamento
    }catch (e:NullPointerException){
        println("Deu problema")
        nome2 = "Sim"
    }
    println(nome2)

}