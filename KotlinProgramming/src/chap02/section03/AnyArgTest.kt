package chap02.section03

fun main() {
    checkArg("Hello");
    checkArg(5);
}

fun checkArg(x : Any){
    /*
    함수의 인자 x가 Any형으로 선언되었다.
    그러면 이 함수는 x에 들어오는 인자의 자료형에 따라 문자열 혹은 정수형 등으로 받아 처리할 수 있게 된다.
     */
    if(x is String){
        println("x is String : $x");
    }
    if(x is Int){
        println("x is Int : $x");
    }
}