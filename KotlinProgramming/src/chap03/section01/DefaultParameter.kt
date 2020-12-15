package chap03.section01

fun main() {
    val name = "김형진";
    val email = "jinkh0129@naver.com";
    add(name);
    add(name,email);
    add("둘리","dooly@naver.com");
    defaultArgs();
    // 함수의 모든 매개변수의 기본값을 지정했다면 인자없이 호출할 수도 있다.
    defaultArgs(200);
}

fun add(name:String, email:String = "default"){
    val output = "${name}님의 이메일은 ${email}입니다.";
    println(output);
}

fun defaultArgs(x:Int=100,y:Int = 200){
    println(x+y);
}