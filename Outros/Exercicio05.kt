/* Este programa lê dois números inteiros e exibi a soma,
a diferença e o produto dos mesmos.*/

fun main ()
{
    println("Insira um número inteiro: ")
    var num1 = readLine()!!.toInt()

    println("Insira um outro número inteiro: ")
    var num2 = readLine()!!.toInt()

    println("""
        $num1 + $num2 = ${num1 + num2}
        $num1 - $num2 = ${num1 - num2}
        $num1 x $num2 = ${num1 * num2}
    """.trimIndent())
}