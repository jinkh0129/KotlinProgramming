package chap02.section03

fun main() {
    val a : Int = 128;
    val b = a;
    println(a===b);

    val c : Int? = a;
    val d : Int? = a;
    val e:Int?=c;
    println(c==d);
    println(c===d);
    println(c===e);
}

/*
코틀린의 자료형은 모두 참조형으로 선언한다.
하지만 컴파일을 거쳐서 최적화될 때  Int, Long, Short와 같은 자료형은 기본형 자료형으로 변환된다.

코틀린에서는 자료형이 서로 다른 변수를 같은 자료형으로 만들어야 연산할 수 있다 -->자료형을 변환하는 법과 검사하는 법을 배워야 함

<자료형 변환 메소드>
toByte, toLong, toShort, toInt, toFloat, toDouble, toChar

<비교>
단순히 값만 비교를 하는 경우는 이중등호(==)를 사용
참조 주소를 비교하려면 삼중등호(===)를 사용 --> 삼중등호는 값과 상관없이!! 참조가 동일하면 true를 반환한다.


 */