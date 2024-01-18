package sel2in
fun main(){
    println("Allo")
    var msgs = listOf( "HowDY", "mIXeD")
    //fold in a new value along with trainsforming current values, initial value not acted on
    println("First:\n" + msgs.fold("HI") { list, s -> list.plus(" " + s.lowercase())  } )
    //starting from the right, extreme right value is added to empty list as is
    println("\nSecond:\n" + msgs.foldRight("HI") { list, s -> list.plus(" " + s.lowercase())  } )

}


class K1 {
    fun sayIt(){
        println("Allo")
    }
}