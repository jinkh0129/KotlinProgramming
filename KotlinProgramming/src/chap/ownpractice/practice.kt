package chap.ownpractice

import chap03.section01.normalVarargs

fun main() {
    VarArgument(1,2,3,4,5,6,7,89);
    VarArgument(5,65,468,456,1622,2);
}

fun VarArgument(vararg numbers:Int){
    for(number in numbers){
        print("$number ");
    }
    println("\n");
}