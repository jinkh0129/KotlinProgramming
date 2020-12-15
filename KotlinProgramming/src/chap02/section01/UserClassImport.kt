package chap02.section01
// 사용자가 직접 만든 클래스를 다른 패키지에서 사용하는 방법이다.
/*
이 경우에는 패키지의 이름(com.example.edu)과 함께 패키지의 요소를
import 키워드와 함께 적으면 된다.
이 예시는 com.example.edu 패키지에 포함된 Persom클래스를
chap02.section01 패키지에 가져오는 것이다.
 */

//import com.example.edu.Person
import com.example.edu.Person as DifferentPack

fun main() {
    val user1 = DifferentPack("kildong",30)
    val user2 = Person("jinkh0129", "KHJ")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}

class Person(val id:String, val name:String)
// 현재 패키지에 있는 Person이라는 클래스이다.


// 동일한 패키지 내에서는 동일한 이름의 클래스를 생성할 수 없다.
/*
클래스의 이름은 동일한데 패키지의 이름만 다른 경우는
as라는 키워드를 이용해서 클래스 이름에 별명을 붙여 사용하면 된다.
위의 예제는 com.example.edu 패키지의 Person이라는 클래스의 별명을
DifferentPack으로 준 것이다.
 */