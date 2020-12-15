package chap02.section03

fun main() {
    var str1 : String? = "Hello World";
    // String과 String?이 서로 다른 자료형이라는 것을 확실히 알아야 한다.
    str1 = null;
    println("str1 : $str1")
    println("str1 : $str1 length : ${str1?.length}")
    //println("str1 : $str1 length : ${str1!!.length}")
    /*
    non-null 단정 기호(!!.)는 변수에 할당된 값이 null이 아님을 단정하므로
    컴파일러가 null 검사 없이 무시해버린다.
    그러다가 실행하면 NPE에 걸리는거다.

    세이프 콜(?.)은 null이 할당되어 있을 가능성이 있는 변수를 검사하여 안전하게 호출하도록 도와주는 기법이다.
    -->세이프 콜은 조심스럽게 의심되어 있는 변수를 호출하여 null값이었으면 그대로 null을 출력할 수 있도록 도와준다.
     */

    var str2 : String? = "Hello Kotlin";
    str2 = null;
    // 조건식을 사용해서 null 상태를 검사할 수도 있다.
    val len = if(str2 != null) str2.length else -1;
    println("str2 : $str2 length : ${len}");
    // 조건문을 활용하면 null인 경우와 null이 아닌 경우를 나눠서 서로 다른 실행을 할 수 있도록 해준다.
}

/*
코틀린은 변수를 사용할 때 반드시 값이 할당되어 있어야 한다는 원칙이 있다.
(값이 없는 상태는 null이라고 부른다)
코틀린에서는 null 상태인 변수를 허용하려면 물음표(?) 기호를 사용해 선언해야 한다.
물론 null을 허용하는 변수를 사용하려면 null을 검사하고 처리하는 방법까지 고려해야 한다.

null을 허용한 변수를 사용하려면 세이프 콜과 non-null 단정 기호를 활용해야 한다.
 */