package chap04.section03
/*
<break문과 continue문>
break : 해당 키워드를 사용한 지점에서 for나 while, do~while문 루프를 빠져나오게 된다.
continue : 이후 본문을 계속 진행하지 않고 다시 반복 조건을 살펴보게 된다.
 */

fun main() {
    for(i in 1..5){
        if(i==3) break // 구문을 빠져나간다.
    }
    println() // 개행 문자
    println("outside")

    for (i in 1..5){
        if(i==3) continue // 해당 부분만 건너뛰고 다시 반복문으로 돌아간다.
        print(i)
    }
    println()
    println("outside")
}

/*
<break와 continue에 라벨 함께 사용하기>
break와 함께 라벨을 사용해서 반복문이 중단되는 위치를 바꿔 본다.
 */

fun labelBreak1(){
    println("labelBreak1")
    for(i in 1..5){
        second@ for (j in 1..5){
            if(j==3) break
            // 라벨없이 break만 사용하면 화살표의 흐름처럼 가장 가까운 반복문 블록을 중단하기 때문에 second@ for가 중단되고 첫 번째 for가 재개된다.
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

fun labelBreak2(){
    println("labelBreak2")
    first@ for(i in 1..5){
        second@ for(j in 1..5){
            if(j==3) break@first
            // break@first라벨을 사용하는 경우에는 화살표의 흐름과 같이 first@ for로 빠져나가면서 for문이 종료된다.
            // 첫 번째 for가 중단되어 이후 루프의 내용은 출력되지 않는다.
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

fun labelBreak3(){
    println("labelBreak2")
    first@ for(i in 1..5){ // (a)
        second@ for(j in 1..5){
            if(j==3) continue@first
            // break@first를 continue@first로 바꿔보면
            // continue에서도 가까운 반복문 블록이 아닌 라벨이 지정된 위치(a)에서 반복문이 재개된다.
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}