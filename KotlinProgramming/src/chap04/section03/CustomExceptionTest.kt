package chap04.section03

import chap03.section01.namedParam
import java.lang.Exception

class InvalidNameException(message: String):Exception(message) // (1) 사용자 예외 클래스
// (1)에서 기존의 Exception 클래스로부터 InvalidNameException 클래스를 콜론(:)을 통해 하위 클래스로 선언한다.

fun main() {
    var name = "kildong123" // (2) 숫자가 들어있는 이름
    try{
        validateName(name)
    } catch (e : InvalidNameException) { // (3) 숫자가 포함된 예외 처리
        println(e.message)
    } catch (e : Exception) { // (4) 기타 예외처리
        println(e.message)
    }
}

fun validateName(name:String) {
    if (name.matches(Regex(".*\\d+.*"))) { // (5) 이름에 숫자가 포함되어 있으면 예외를 발생시킴
        throw InvalidNameException("Your name : $name : contains numerals")
    }
}