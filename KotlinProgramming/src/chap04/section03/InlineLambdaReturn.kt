package chap04.section03

import chap03.section06.b

/*
<흐름 제어문>
return : 함수에서 결괏값을 반환하거나 지정된 라벨로 이동한다.
break : for문인 while문의 조건식에 상관없이 반복문을 끝낸다.
continue : for문이나 while문의 본문을 모두 수행하지 않고 다시 조건식으로 넘어간다.

<예외 처리문>
try{...}catch{...} : try블록의 본문을 수행하는 도중 예외가 발생하면 catch 블록의 본문을 실행한다.
try{...}catch{...}finally{...} : 예외가 발생해도 finally 본문은 항상 실행한다.
 */

fun add(a:Int, b:Int):Int{
    return a+b
    println("이 코드는 실행되지 않습니다.") // return을 만나면 함수를 끝내버리기 때문이다.
}

// return으로 Unit을 반환하는 방법(1)
fun hello(name:String):Unit{
    println(name)
    return Unit
} // Unit을 명시적으로 반환

// return으로 Unit을 반환하는 방법(2)
fun hello2(name:String):Unit{
    println(name)
    return
} // Unit 이름을 생략한 반환

// return으로 Unit을 반환하는 방법(3)
fun hello3(name:String){
    println(name)
} // return문 자체를 생략



// 인라인으로 선언된 함수에서 람다식을 매개변수로 사용하면 람다식에서 return을 사용할 수 있다.
fun main() {
    retFunc()
}
inline fun inlineLambda(a:Int,b:Int,out:(Int,Int)->Unit){
    out(a,b)
}

fun retFunc(){
    println("start of retFunc") // (1)
    inlineLambda(13,3){a,b-> // (2)
    val result = a+b
    if(result>10) return // (3) 10보다 크면 이 함수를 바로 빠져나가서 (4),(5)를 실행X
    println("result : $result") // (4) 10보다 크면 이 문장에 도달하지 못함.
    }
    println("end of retFunc") // (5)
}

/*
조건문에서 return이 호출되고 람다식 바깥의 retFunc() 함수까지 빠져 나가게 된다.
따라서 (4),(5)번은 실행되지 않고, 이런 반환을 비지역(Non-local)반환이라고 한다.
 */