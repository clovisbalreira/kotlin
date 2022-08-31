import java.math.RoundingMode
import java.text.DecimalFormat

fun main(args: Array<String>){
    val random = 8435.21057752090819915

    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    println(VERMELHO)
    println("------------------------------------")
    println("\t\tCADASTRO ESTUDONAUTA")
    println("------------------------------------")
    println(RESET)
    print("Nome do funcionário: ")
    var nome:String = readLine()!!
    print("Ano de nascimento: ")
    var anoNascimento:Int = readLine()!!.toIntOrNull()?:0
    print("Salário: R$ ")
    var salario:Float = readLine()!!.toFloatOrNull()?:0F
    val salarioFormatado = df.format(salario)
    println(AMARELO)
    println("----------FICHA FUNCIONAL-----------")
    println("Nome:\t\t\t $nome")
    println("Nascimento:\t\t $anoNascimento ")
    println("Salário: \t\t $salarioFormatado")
    println("------------------------------------")
}