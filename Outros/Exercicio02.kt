/Este programa lê dois números inteiro e mostra a subtração do primeiro pelo segundo

fun main ()
{
    println("Insira um número inteiro: ")
    val number1 = readLine()!!.toInt()

    println("Insira um outro número inteiro: ")
    val number2 = readLine()!!.toInt()

    println("$number1 - $number2 = ${number1 - number2}")
}
