fun main(args: Array<String>) {
    println("Limites")
    println("Mínimo: " + Short.MIN_VALUE)
    println("Máximo: " + Short.MAX_VALUE)
    println("Tamanho: " + Short.SIZE_BYTES + "bytes")
    println("Inferência")
    val x:Int = 10
    var y = 20F
    println(x is Int)
    println(y is Float)
    println("Tipo Any")
    var x1:Any
    x1 = 10
    println(x1)
    x1 = 12.5
    println(x1)
    x1 = "Kotlin"
    println(x1)
}