package chap03.section05

fun main() {
    shortFunc1(3){println("First call : $it")}
}

inline fun shortFunc1(a:Int, noinline out:(Int)->Unit){
    println("Befor calling out()")
    out(a)
    println("After calling out()")
}