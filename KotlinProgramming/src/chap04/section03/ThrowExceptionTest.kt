package chap04.section03

import java.lang.Exception
/*
<예외 발생시키기>
의도적으로 예외를 발생시킬 수 있다.
throw키워드를 사용하면 된다.
 */
// 잔고가 1,000 이하일 때 예외를 발생하는 예제이다.
fun main() {
    var amount = 600

    try{
        amount -= 100
        checkAmount(amount)
    } catch (e : Exception) {
        println(e.message)
    }
    println("amount : $amount")
}

fun checkAmount(amount: Int){
    if(amount<1000)
        throw Exception("잔고가 $amount 으로 1000 이하입니다.")
}