package chap03.section03

// 일반 함수를 인자나 반환값으로 사용하는 고차 함수
fun main() {
    var res1=sum(3,2); // 일반 인자
    var res2=mul(sum(3,3),3); // 인자에 함수를 사용

    println("res1 : $res1, res2 : $res2");
}

fun sum(a:Int,b:Int)=a+b
fun mul(a:Int,b:Int)=a*b
