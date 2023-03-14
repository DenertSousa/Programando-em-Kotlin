/*Este programa recebe três números e mostra o maior entre eles.*/

fun main ()
{
    println("Insira um número inteiro: ")
    val number1 = readLine()!!.toInt()

    println("Insira um outro número inteiro: ")
    val number2 = readLine()!!.toInt()

    println("Insira um último número inteiro: ")
    val number3 = readLine()!!.toInt()

    if (number1 > number2 && number1 > number3){
        println("$number1 é o maior número")
    } else if (number2 > number1 && number2 > number3) {
        println("$number2 é o maior número")
    } else if (number3 > number1 && number3 > number2){
        println("$number3 é o maior número")
    }
}
