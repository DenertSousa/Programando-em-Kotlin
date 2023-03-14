/*Este programa recebe um número digitado pelo usuário e calcula e mostra
 * o quadrado, o cubo, a raíz quadrada e a raíz cúbica desse número*/

import kotlin.math.sqrt

fun main ()
{
    println("Por favor, digite um número positivo e diferente de 1: ")
    var num = readLine()!!.toDouble()

    var numSquare = num * num
    var numCubic = num * num * num
    var numSquareRoot = sqrt(num) // a função sqrt e cbrt so funciona para numero do tipo Double
    var numCubicRoot = Math.cbrt(num)

    println("""
        $num² = $numSquare
        $num³ = $numCubic
        sqrt($num) = $numSquareRoot
        cbrt($num) = $numCubicRoot
    """.trimIndent())
}