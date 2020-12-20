package chap05.section01.define
/*
<클래스 선언하기>
특별히 프로퍼티와 메서드를 정의하지 않고 이렇게 빈 형태로 클래스를 선언할 수 있다.
이때는 중괄호도 생략할 수 있다.
class Bird
class Bird {}

내용을 기술하기 위해서는 중괄호({})를 이요해 블록을 구성한다.
class Bird {
    // 프로퍼티
    // 메서드
}
 */


class Bird { // (1)클래스의 정의
    // (2)프로퍼티(속성)
    var name:String = "mybird"
    var wing:Int = 2
    var beak:String = "short"
    var color:String = "blue"

    // (3)메서드(함수)
    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vol : $vol")
}

fun main() {
    val coco = Bird() // (4)클래스의 생성자를 통한 객체의 생성
    coco.color = "blue" // (5) 객체의 프로퍼티에 값 할당

    println("coco.color : ${coco.color}") // (6)객체의 멤버 프로퍼티 읽기
    coco.fly() // (7) 객체의 멤버 메서드 사용
    coco.sing(3)
}

/*
(1)번의 클래스의 정의 부분을 살펴보면 class 키워드를 사용해 클래스 이름 Bird를 정의
(2) 변수 선언과 같은 방법으로 프로퍼티를 선언. 프로퍼티는 반드시 초기화되어 있어야 한다.
(3) 함수를 선언하는 방법과 동일하게 메서드를 정의
(4) coco란 이름으로 객체를 만들어 낸다.
(5) 프로퍼티에 값을 할당
(6) 객체의 프로퍼티로부터 값을 읽거나
(7) 메서드를 실행
--> 점(.) 표기법으로 이 객체의 멤버 메서드에 접근할 수 있다


Bird클래스란 일종의 선언일 뿐 실제 메모리에 존재헤 실행되고 있는 것이 아니다.
이 클래스로부터 객체를 생성해야만 비로소 클래스라는 개념의 실체인 객체가 물리적인 메모리 영역에서 실행되는 것이다.

특정 클래스로부터 만들어진 객체는 그 클래스의 인스턴스라고 부른다. 객체는 조금 더 포괄적인 용어로 특정 클래스가 아닌 모든 실체화된 것들을 가리킨다.

'Bird 클래스로부터 coco라는 객체가 생선된다.' or 'coco는 Bird 클래스의 인스턴스이다'

val coco = Bird()
--> 객체를 생성할 때 클래스 이름 뒤에 Bird()처럼 소괄호()가 사용된다. 이것은 클래스로부터 객체를 생성하는 특별한 함수인 생성자를 의미한다.
생성자란 객체를 생성할 때 자동 실행되는 함수를 말한다.
 */