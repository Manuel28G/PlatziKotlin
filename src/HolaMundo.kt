fun main() {
    println("Hola Mundo")
    println(4+2)
    println(4-2)
    println(4*2)
    println(4/2)
    println(4%2)
    var a = 4
    val b = 2
    println("*********Using object functions**********")
    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))
    println(a.rem(b))
    a = 5
    println("Valor antes de incrementar a: $a")
    println(a.inc())
    println("Valor despues de incrementar a: $a")
    println(a.dec())
    println("Valor despues de decrementar a: $a")

    //RAW String
    val parrafo ="""
        ** Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore
        ** magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
        ** consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
        ** Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
    """
    println("C**********Con indentado ******************")
    println(parrafo)
    println("C**********Sin indentado ******************")
    println(parrafo.trimIndent())
    println("************Removing trash elemnts***********")
    println(parrafo.trimMargin("** "))
}