package chap02.section2

fun main() {
    val code : Int = 65;
    val chFromCode: Char = code.toChar();
/*
정수 자료형을 이용하여 문자 자료형을 선언할 때 쓰는 방법이다.
정숫값을 변환하는 함수 toChar()를 이용하여 문자 자료형을 선언하면 된다.
 */
    val ch3 = '\uD55C'
    println(chFromCode);
    println(ch3);

    val str1 : String = "Hello";
    val str2 = "World";
    val str3 = "Hello";

    println("str1 === str2: ${str1 === str2}");
    println("str1 === str3: ${str1 === str3}"); // ===는 참조 비교를 위한 연산자이다. 둘은 참조하는 곳이 같으므로 true를 반환한다.
    /*
    같은 문자열이 저장되면 스택에 2번 저장하는 것보다
    이미 저장된 값을 활용하는 것이 효율적이다.
    그래서 코틀린은 힙 영역에 String Pool이라는 공간에 문자열 "Hello"를 저장해 두고 이 값을 str1, str3이 참조하도록 만든다.
     */
}

/*
<부호가 있는 정수 자료형>
Long(8바이트)
Int(4바이트)
Short(2바이트) : -32,768~32,767
Byte(1바이트) : -128~127

보통 숫자값은 Int형으로 추론되기 때문에 만일 좀 더 작은 범위의 정수 자료형인 Byte형이나 Short형을
사용하기 위해서는 다음과 같이 직접 자료형을 명시해주어야 한다.
val exp08:Byte=127

<실수 자료형>
Double(8바이트)
Float(4바이트)

실수도 자료형을 명시하지 않으면 Double형으로 추론이 된다.

<논리 자료형>
Boolean(1비트) : true, false     cf)파이썬에서는 무조건 첫글자 대문자로 써야하는데...

<문자 자료형>
Char(2바이트:16비트)

코틀린에서 문자 자료형을 선언할 때만큼은 문자 값으로 선언해야 한다. 선언한 다음에는 문자 자료형에 숫자를 더하는 방식으로
다른 문자를 표현할 수 있다.
ex)
val ch ='A'
println(ch+1)

val chNum:Char = 65 와 같이 그렇다고 해서 숫자로 선언하는 것은 금지다.
*/