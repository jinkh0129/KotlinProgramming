package chap03.section03
// 이름에 의한 람다식 호출

fun main() {
    val result = callByName(otherlambda) // 람다식 이름으로 호출
    println(result);
}

fun callByName(b:() -> Boolean):Boolean{ // 람다식 자료형으로 선언된 매개변수
    println("callByName funcion");
    return b()
}

val otherlambda: () -> Boolean = {
    println("otherLambda function");
    true
}