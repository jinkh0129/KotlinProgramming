package chap04.section03
/*
<예외처리>
프로그램 코드를 작성하다 보면 해당 코드가 제대로 작동하지 못하고 중단되는 현상이 발생할 수도 있다. 이를 예외라고 한다.
예외를 발생시키는 상황으로는 다음과 같은 것들이 있다.
 - 운영체제의 문제(잘못된 시스템 호출의 문제)
 - 입력값의 문제(존재하지 않는 파일 또는 숫자 입력란에 문자 입력 등)
 - 받아들일 수 없는 연산(0으로 나누기 등)
 - 메모리의 할당 실패 및 부족
 - 컴퓨터 기계 자체의 문제(전원 문제, 망가진 기억 장치 등)

try블록에서 예외가 발생하면 catch 블록에서 잡아서 그 예외를 처리한다.

try{
    예외 발생 가능성 있는 문장
} catch (e:예외 처리 클래스 이름){
    예외를 처리하기 위한 문장
} finally {
    반드시 실행되어야 하는 문장
}
 */

fun main() {
    val a = 6
    val b = 0
    val c : Int

    try{
        c=a/b
    } catch (e : Exception) { // catch의 인자에 Exception 클래스는 일반적인 모든 예외를 가리킨다. 특정 예외를 지정하는 요소도 있다.
        //} catch (e : ArithmeticException) {
        //println("Exception is handled. ${e.message}")
    //}
        // e.message처럼 예외를 가리키는 객체 e의 멤버 변수 또는 프로퍼티로 불리는 message를 읽으면 예외 원인을 간단히 출력해 준다.
        println("Exception is handled.")
        e.printStackTrace() // 오류의 원인이 되는 줄을 스택으로부터 추적할 수 있다.
    } finally {
        println("finally 블록은 반드시 항상 실행됨")
    }
}
