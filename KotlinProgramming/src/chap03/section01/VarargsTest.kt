package chap03.section01

fun main() {
    normalVarargs(1,2,3,4);
    normalVarargs(4,5,6);
}

fun normalVarargs(vararg counts:Int){
    for (num in counts){
        print("$num ");
    }
    print("\n");
}
// 가변인자(Variable Argument) : 인자의 개수가 변한다는 뜻이다.
// 가변인자의 사용법은 매개변수의 왼쪽에 varargs라는 키워드를 붙이면 된다.