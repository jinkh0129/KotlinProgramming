package chap02.section2

fun main() {
    val number = 10;
    var langauge = "Korean"; // 자료형을 지정안하고 변수를 선언하면 추론함.
    val secondNumber: Int = 20; // 자료형을 명시적으로 지정
    langauge = "English"; // var 키워드로 선언한 변수는 값을 다시 할당할 수 있음

    println("number : $number");
    println("langauge: $langauge");
    println("secondNumber : $secondNumber");

}

/*
자료형을 지정하지 않아서 추론되는 변수에 대해서는
자료형을 지정하지 않은 변수를 클릭해 입력 커서를 놓고 ctrl+shift+p를 누르면 추론된 자료형을 말풍선으로 알려준다.
 */

/*
변수이름 선언시 주의사항
1. 변수 이름은 숫자로 시작하면 안된다.
2. while, if와 같이 코틀린에서 사용되는 키워드는 사용할 수 없다.
3. 변수 이름은 의미있는 단어를 사용하면 좋다.
4. 여러 단어를 사용하여 변수 이름을 지을 때 카멜 표기법(첫번째 글자는 소문자, 나머지 각 단어의 첫번째 글자를 대문자로)을 사용하는 것이 좋다.
ex)numberOfBook
 */