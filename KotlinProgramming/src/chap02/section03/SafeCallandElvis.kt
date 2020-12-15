package chap02.section03

fun main() {
    var str1 : String? = "Hello world";
    str1 = null;
    println("str1 : $str1 length : ${str1?.length ?: -1}");
    /*
    null을 허용한 변수를 조금 더 안전하게 사용하려면 세이프콜과 엘비트 연산자를 함께 사용하면 된다.
    엘비스 연산자는 변수가 null인지 아닌지 검사하여 null이 아니라면 왼쪽 식을 그대로 실행하고 null이라면 오른쪽 식을 실행하게 한다.

    엘비스 연산자를 사용하면 null인 경우 반환값을 -1과 같은 특정 값으로 대체함으로써 null발생을 대비할 수 있으므로 안전하다.
    또한 코드를 한 줄에 표현할 수 있어 가독성이 좋아진다.
     */

    //val a : Int = 1;
    //val b : Double = a; //Type Mismatch오류 발생
    //val c : Int = 1.1; //Type Mismatch오류 발생
    
    //val b : Double = a.toDouble() // 변환 메서드 사용

    //val result = 1L + 3; // 표현식에서 자료형이 서로 다른 값을 연산하면 큰 자료형으로 자동 형 변환이 일어난다.
}