import java.time.LocalDateTime
fun main(args: Array<String>) {
    println("Data Hora")
    var dh = LocalDateTime.now()
    println("Dia atual ${dh.dayOfMonth}")
    println("Mês atual ${dh.monthValue}")
    println("Ano Atual ${dh.year}")
    println("------------")
    println("Hora Atual ${dh.hour}")
    println("Minuto Atual ${dh.minute}")
    println("Segundo Atual ${dh.second}")
}