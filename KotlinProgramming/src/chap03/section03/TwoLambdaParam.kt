package chap03.section03

fun main() {
    twoLambda({a,b->"First $a $b"}, {"Second $it"});
    twoLambda({a,b->"First $a $b"}) {"Second $it"};
}
// 2개의 람다식이 정의되어 있으면 소괄호를 생략할 수 없다.
/*
({첫번째},{두번째})
({첫번째}){두번쩨}

람다식 함수가 3개가 되었을 때도 마찬가지로 마지막 람다식만 빼내어 다음과 같이 구성할 수 있다.
({첫번째},{두번째}) {세번째}
*/
fun twoLambda(first:(String,String)->String, second:(String)->String){
    println(first("OneParam","TwoParam"))
    println(second("OneParam"))
}
