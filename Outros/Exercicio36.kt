/* Este programa determina se um número A é divisível
por um outro número B a partir valores fornecidos pelo usuário.*/

fun main()
{
    println("Insira um número inteiro (numerador): ")
    var number1 = readLine()!!.toInt()
    println("Insira um outro número também inteiro (denominador): ")
    var number2 = readLine()!!.toInt()
    quociente(number1, number2)
}

fun quociente (x: Int, y: Int) {
    var resto = x % y
    if (resto == 0) println("$x é divísivel por $y") else println ("$x não é divísivel por $y")
}
