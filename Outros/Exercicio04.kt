//Este programa lê quatro número decimais e mostra a soma entre eles

fun main ()
{
    println("Insira um número decimal: ")
    var number1 = readLine()!!.toFloat()

    println("Insira mais um número decimal: ")
    var number2 = readLine()!!.toFloat()

    println("Insira outro número decimal:")
    var number3 = readLine()!!.toFloat()

    println("Insira um último número decimal: ")
    var number4 = readLine()!!.toFloat()

    println("A soma dos 4 números que você escolheu é ${number1 + number2 + number3 + number4}")
}