/*Este programa lê dois números digitados pelo teclado e informa qual deles é maior, ou se são iguais.*/

fun main () {
    print("Insira um número inteiro: ")
    val number1: Int = readLine()!!.toInt()
    print("Insira um segundo número inteiro: ")
    val number2: Int = readLine()!!.toInt()

    if (number1 > number2)
        println("\n\nO número $number1 é maior que o número $number2")
    else if (number2 > number1)
        println("O número $number2 é maior que o número $number1")
    else
        println ("Os dois números informados são iguais")
}
