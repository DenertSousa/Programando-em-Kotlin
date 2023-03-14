/*Este programa lê um número inteiro e imprime se ele é par ou ímpar*/

fun main ()
{
    println("Escreva um número inteiro: ")
    var number = readLine()!!.toInt()

    var verification = number % 2

    if (verification == 0)
        println("O número inserido é par")
    else
        println("O número inserido é ímpar")
}