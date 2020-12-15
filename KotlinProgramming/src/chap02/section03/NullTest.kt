package chap02.section03

fun main() {
    var str1 : String? = "Hello World";
    str1 = null;
    println("str1 : $str1")
    println("str1 : $str1 length : ${str1?.length}")
    //println("str1 : $str1 length : ${str1!!.length}")
    /*
    non-null 단정 기호(!!.)는 변수에 할당된 값이 null이 아님을 단정하므로
    컴파일러가 null 검사 없이 무시해버린다.
    그러다가 실행하면 NPE에 걸리는거다.
    세이프 콜(?.)은 null이 할당되어 있을 가능성이 있는 변수를 검사하여 안전하게 호출하도록 도와주는 기법이다.
     */

    var str2 : String? = "Hello Kotlin";
    str2 = null;
    // 조건식을 사용해서 null 상태를 검사할 수도 있다.
    val len = if(str2 != null) str2.length else -1;
    println("str2 : $str2 length : ${len}");
}