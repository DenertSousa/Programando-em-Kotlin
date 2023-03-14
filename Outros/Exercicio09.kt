/*Este programa e recebe um número do usuário
 e imprime se o número é, ou não, múltiplo de 3.*/

fun main ()
{
    println("Informe um número inteiro, e vamos lher dizer se ele é, ou não, múltiplo de 3: ")
    var number = readLine()!!.toInt()

    var mod = number % 3

    if (mod == 0) println("O número $number é múltiplo de 3")
    else println("O número $number não é múltiplo de 3")
}