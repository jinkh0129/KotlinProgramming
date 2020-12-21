package chap05.section02.init

class Bird(var name:String, var wing:Int, var beak:String, var color:String){

    // 초기화 블록(init블록)
    // 객체를 생성할 때 변수 초기화 이외에 코드를 실행할 수 있다.
    // 클래스 이름 다음에 주 생성자를 표현하는 경우 클래스 블록({}) 안에 코드를 넣을 수 없다.
    // 초기화에 꼭 사용해야 할 코드가 있다면 init{...} 초기화 블록을 클래스 선언부에 넣어 주어야 한다.
    
    init { // (1) 초기화 블록
        println("------- 초기화 블록 시작 -------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("------- 초기화 블록 끝 -------")
    }
    
    // 메서드
    fun fly() = println("Fly wing : $wing")
    fun sing(vol:Int) = println("Sing vol : $vol")
}

fun main() {
    val coco : Bird = Bird("mybird",2,"short","blue") // (2) 객체 생성과 함께 초기화 블록 수행

    coco.color = "yellow"
    println("coco.color : ${coco.color}")
    coco.fly()

    val coco1 : Bird1 = Bird1(beak="long", color="red") // 기본값이 있는 것은 생략하고 없는 것만 전달 가능하다.

    println("coco1.name : ${coco1.name}, coco1.wing : ${coco1.wing}")
    println("coco1.color : ${coco1.color}, coco1.beak : ${coco1.beak}")

}
/*
(1)번 init 초기화 블록에서 name과 beak를 출력하고 sing() 메서드를 사용.
init 초기화 블록에서는 출력문이나 프로퍼티, 메서드 등과 같은 코드를 사용할 수 있다.
초기화 블록에서 명시한 내용은 (2)번에서 객체 생성과 함께 같이 실행이 된다.
객체 생성 시점에서 코드 수행 문장을 실행할 수 있어 매우 편리하다.
 */

// <프로퍼티의 기본값 지정>
class Bird1(var name:String="NONAME", var wing:Int=2, var beak:String, var color: String){

}
// 생성자의 매개변수에 기본값을 사용할 수 있다. 그러면 객체를 생성할 때 기본값이 있는 인자는 생략할 수 있다.