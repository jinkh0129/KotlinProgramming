package chap02.section03
// 만약 어떤 값이 정수일수도, 실수일수도 있다면 어떻게 해야할까?
// 그때마다 자료형을 변경해주는 것은 여간 번거로운 일이 아니다.
// 이때 필요한 것이 스마트 캐스트(Smart Cast) --> 자료형으로 Number형을 선언!!!
fun main() {
    var test:Number=12.2;
    println("$test");

    test = 12;
    println("$test");

    test = 120L;
    println("$test");

    test += 12.0f;
    println("$test");
    /*
    스마트 캐스트(smart cast)는 컴파일러가 "자동으로 형 변환"을 해 주는 것을 말한다.
    대표적으로 스마트 캐스트가 적용되는 자료형은 Number형이 있다.
    Number형을 사용하면 숫자를 저장하기 위한 특수한 자료형 객체를 만든다.
    Number형으로 정의된 변수에는 저장되는 값에 따라 정수형이나 실수형 등으로 자료형이 변환된다.
     */
}