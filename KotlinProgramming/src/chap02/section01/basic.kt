package chap02.section01
/*
파일의 맨 위에는 이 파일이 어떤 패키지에 포함된 것인지 코틀린 컴파일러가
알 수 있도록 패키지 이름을 선언해야 한다.
패키지 이름을 선언하지 않으면 그 파일은 자동으로 default 패키지에 포함된다.
 */
fun main() {
    print("Hello Kotlin")
}
// println은 줄바꿈이 포함되어 있고 print는 줄바꿈이 없다.

/*
만일 파일에 1개의 클래스가 정의되어 있다면 project의 창 화면에서 .kt확장자가 빠진
클래스 이름만 보이게 된다.
파일에 클래스를 여러 개 정의한다면 파일은 단순히 클래스를 묶는 역할을 하고
.kt확장자가 붙게 된다.
같은 파일에 있는 여러 개의 클래스는 모두 그 파일에서 지정한 패키지로 인식한다.
 */


