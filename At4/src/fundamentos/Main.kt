package fundamentos
fun main(args: Array<String>) {
   println(soma(a = 2, b = 3))
    println(soma(a =  11))
}
fun soma(a: Int, b: Int = 1): Int {
    return a + b
}
