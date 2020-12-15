package chap02.section03

fun main() {
    val num = 256;

    if(num is Int){
        println(num);
    } else if(num !is Int){
        println("Not a Int");
    }
    /*
    변수의 자료형을 알아내는 방법은 is 키워드를 사용하는 것이다.
    사실 알아낸다기 보다는 맞는지 확인한다고 하는 것이 더 정확하다.
    is는 왼쪽 항의 변수가 오른쪽 항의 자료형과 같으면 true를, 아니면 false를 반환한다.
     */
    val x : Any;
    x = "Hello";
    if(x is String){
        println(x.length);
    }
    /*
    is는 변수의 자료형을 검사한 다음 그 변수를 해당 자료형으로 변환하는 기능도 있다.
    Any형을 사용하면 자료형을 결정하지 않은 채로 변수를 선언할 수 있다.
    is를 사용하여 자료형을 검사하면 검사한 자료형으로 스마트 캐스트가 된다.
     */
    val b1 : String = "KHJ"
    val b2 : String = "PJI"

    
    val a1 : String = b1 as String
    /*
    <as에 의한 스마트 캐스트>
    as로 스마트 캐스트를 할 수도 있다. as는 형 변환이 가능하지 않으면 예외를 발생시킨다.
    위의 경우는 b1가 null이 아니면 String형으로 형 변환되어 a1에 할당된다.
    그러나 b1이 null이면 형 변환을 할 수 없으므로 예외가 발생한다.
    null 가능성도 고려하여 예외 발생을 피하려면 아래와 같이 물음표(?) 기호를 사용할 수도 있다.
     */
    val a2 : String? = b2 as? String
}