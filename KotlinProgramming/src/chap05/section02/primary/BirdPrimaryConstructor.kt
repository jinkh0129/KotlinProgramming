package chap05.section02.primary
// 주 생성자를 사용하는 Bird 클래스 선언
// --> 주 생성자는 클래스 이름과 함께 생성자 정의를 이용할 수 있는 기법이다.
// --> 클래스 선언과 동시에 주 생성자의 매개변수(_name,...)를 프로퍼티에 할당하고 있다.
class Bird constructor(_name:String, _wing:Int, _beak:String, _color:String) {
    var name: String = _name
    var wing: Int = _wing
    var beak: String = _beak
    var color: String = _color

    fun fly() = println("Fly wing : $wing")
    fun sing(vol: Int) = println("Sing vol : $vol")
}
// 내부의 프로퍼티를 생략하고 생성자의 매개변수에 프로퍼티 표현을 함께 넣어볼 수도 있다.
// val,var를 사용하여 매개변수를 선언하면 생성자에서 this 키워드를 사용하거나 매개변수 이름에 언더스코어를 붙인 다음 생성자에서 인자를 할당할 필요가 없다.
/*
class Bird(var name:String, var wing:Int, var beak:String, var color:String){

    fun fly(){
        println("Fly wing : $wing")
    }
    fun sing(vol:Int) = println("Sing vol : $vol")
}
// --> 주 생성자의 매개변수에 프로퍼티가 선언되었으므로 본문에서 프로퍼티 선언이 생략되었다.
// 프로퍼티 선언이란 클래스 내부에서 변수를 선언(val,var을 이용)하는 것을 말한다.
*/
fun main() {
    val coco : Bird = Bird("mybird",2,"short","blue")

    coco.color = "yellow"
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)
}