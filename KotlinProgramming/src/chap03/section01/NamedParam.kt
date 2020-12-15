package chap03.section01

fun main() {
    namedParam(x=200,z=100);
    namedParam(z=150);
}
fun namedParam(x:Int=100,y:Int=200,z:Int){
    println(x+y+z);
}

// 매개변수의 기본값을 정해주지 않았다면 반드시 인자를 전달해 주어야 한다.