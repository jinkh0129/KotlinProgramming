package chap02.section2

typealias Username = String; // 함수 밖에서 typealias키워드를 선언해야함.

fun main() {
    val num = 10;
    val formattedString = """
        var a = 6;
        var b = "Kotlin";
        println(a+num);
    """
    println(formattedString);
    val user : Username = "kildong";
    println(user);

}

/*
변수의 자료형이 복잡한 구조를 가지면 자료형에 별명을 붙일 수도 있다.
typealias라는 키워드를 사용하면 된다. 메소드 밖에서 선언해야 한다.
앞으로 배울 고차함수와 람다식에서도 typealias를 많이 사용한다.
 */