/*Este programa imprime:
 1
 1   2
 1   2   3
 .....
 1   2   3   ...  n
 para um n informado pelo usuário.
 Ele utiliza uma função que recebe o valor n inteiro e imprime até a n-ésima linha.*/

fun main (){

    println("Escolha um número inteiro, positivo e maior que zero: ")
    val a = readLine()!!.toIntOrNull()

    if (a != null) {
        if (a <= 0) {
            println("Você digitou um número negativo, ou igual a zero, e este programa somente aceita números positivos.\n" +
                    "Por favor, reinicie o programa e entre com um valor válido.")
        }
        else {
            printTillNLine(a)
        }
    } else {
        println("O que você digitou não é um número.\n" +
                "Por favor, reinicie o programa e entre com um valor válido.")
    }

}

fun printTillNLine(n: Int) {

    val lista = mutableListOf<Int>(1)
    var b: Int = 1

    do {
        println(lista)
        lista.add(b + 1)
        b += 1
    } while (b <= n)
}
