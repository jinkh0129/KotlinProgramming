package chap03.section02

fun main() {
    println(highFunc({x,y -> x+y}, 10 , 20));
}
fun highFunc(sum:(Int,Int) -> Int, a:Int,b:Int) : Int = sum(a,b)

// 고차함수(High-order Function)란 다른 함수를인자로 사용하거나 함수를 결괏값으로 반환하는 함수를 말한다.
// 일급 객체 혹은 일급 함수를 서로 주고받을 수 있는 함수가 고차함수가 되는 것이다.