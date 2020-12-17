package chap04.section02

/*
앞에서 배운 while문은 조건식을 먼저 검사한 후 반복을 진행하기 때문에 처음부터 조건식이 false인 경우 작업이 한 번도 실행되지 않는다.
그러나 do~while문의 경우 일단 do블록에 작성한 본문을 한 번은 실행한 다음 마지막에 조건식을 검사해서 true가 나오면 작업을 다시 반복한다.
 */

fun main() {
    do{
        print("Enter an integer : ")
        val input = readLine()!!.toInt()

        for(i in 0..(input-1)){
            for(j in 0..(input-1)) print((i+j)%input+1)
            println()
        }
    } while (input != 0)
}

/*
나머지 연산은 항상 입력받은 숫자보다 작은 값을 돌려주기 때문에 값을 순환할 때 유용하게 사용된다.
 */