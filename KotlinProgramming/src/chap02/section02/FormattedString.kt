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