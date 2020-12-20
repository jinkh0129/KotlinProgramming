package chap05.section02.secondary
/*
<생성자>
생성자란 클래스를 통해 객체가 만들어질 때 기본적으로 호출되는 함수를 말한다.
클래스 안의 프로퍼티 값을 직접 입력하여 초기화해도 되지만 이렇게 하면 항상 같은 프로퍼티 값을 가지는 객체가 만들어질 것이다.
객체를 생성할 때 필요한 값을 설정하며 객체를 만들면 훨씬 유연할 것이다.
따라서 외부에서 인자를 받아 초기화할 수 있도록 특별한 함수인 constructor()를 정의한다.

class 클래스이름 constructor(필요한 매개변수...){ // 주 생성자의 위치
    ...
    constructor(필요한 매개변수...){ // 부 생성자의 위치
        // 프로퍼티의 초기화
    }
    [constructor(필요한 매개변수...){...}] // 추가 부 생성자
    ...
}
 */

class Bird{
    // (1)프로퍼티-선언만 함
    var name:String
    var wing:Int
    var beak:String
    var color:String

    // (2)부 생성자-매개변수를 통해 초기화할 프로퍼티에 저장
    constructor(name:String,wing:Int,beak:String,color:String){
        this.name=name // (3)this.name은 선언된 현재 클래스의 프로퍼티를 나타냄
        this.wing=wing
        this.beak=beak
        this.color=color
    }
    
    // 메서드
    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vol : $vol")
}

fun main() {
    val coco=Bird("mybird",2,"short","blue") // (4)생성자의 인자로 객체 생성과 동시에 초기화

    coco.color="yellow"
    println("coco.color = ${coco.color}")
    coco.fly()
    coco.sing(3)
}