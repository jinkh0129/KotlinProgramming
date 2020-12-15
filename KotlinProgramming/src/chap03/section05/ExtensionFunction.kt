package chap03.section05

fun main() {
    val source="Hello Kotlin";
    val target="Kotlin";
    println(source.getLongString(target));
}

fun String.getLongString(target:String):String=
    if(this.length>target.length)this else target