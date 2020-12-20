package chap04.section03.NoInlineLambdaReturn

/*
비지역 반환을 방지하고 가장 가까운 함수인 retFunc() 함수 위치로 빠져 나가게 하려면 어떻게 해야할까?
이런 경우에는 람다식에서 라벨을 정의해 return을 사용해야 한다.
라벨을 지정하기 위해서 정의할 때는 @기호를 라벨 뒤에 붙여 라벨 이름@과 같이 지정하고, 사용할 때는 앞부분에 return@라벨이름으로 지정한다.
 */

fun main() {
    retFunc()
}

fun inlineLambda(a:Int, b:Int, out:(Int,Int)->Unit){ // inline을 제거
    out(a,b)
}

fun retFunc(){
    println("start of retFunc")
    inlineLambda(13,3) lit@{a,b-> // (1) 람다식 블록의 시작 부분에 라벨을 지정
        val result = a+b
        if(result>10) return@lit // (2) 라벨을 사용한 블록의 끝부분으로 반환
        println("result : $result")
    } // (3) 이 부분으로 빠져나감
    println("end of retFunc") // (4) 이 부분이 실행
}

/*
<암묵적 라벨>
람다식 표현식 블록에 직접 라벨을 쓰는 것이 아닌 람다식의 명칭을 그대로 라벨처럼 사용할 수 있는데 이것을 암묵적 라벨이라고 부른다.
 */

fun retFunc2(){
    println("start of retFunc2")
    inlineLambda(13,3){a,b->
        val result = a+b
        if(result>10) return@inlineLambda // 람다식의 이름을 직접 라벨처럼 사용할 수 있다.
        println("result : $result")
    }
    println("end of retFunc2")
}

/*
<익명 함수를 사용한 반환>
람다식 대신에 익명 함수를 넣을 수도 있다. 이때는 라벨을 사용하지 않고도 가까운 익명 함수 자체가 반환된다.
위와 동일한 결과를 가질 수 있게 된다.
 */
fun retFunc3(){
    println("start of retFunc3")
    inlineLambda(13,3, fun (a,b){
        val result = a+b
        if(result>10) return
        println("result : $result")
    })
    println("end of retFunc3")
}