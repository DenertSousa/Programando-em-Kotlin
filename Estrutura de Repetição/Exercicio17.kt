/*Este programa recebe um número inteiro e positivo, e calcula o fatorial dele. */

fun main  () {

    println("Informe um número inteiro e positivo que iremos calcular o seu fatorial!:")
    var input: Int? = readLine()!!.toIntOrNull()

    var n = if (input != null) {
        input
    } else {
        -1
    }

    var nFactorial = 1

    if (n >= 0) {
        for (i in 1..n) {
            nFactorial *= i
        }

        println("$n! = $nFactorial")
    } else {
        println("O número que você escolheu, ou o que você digitou, não atende as condições pedidas.")
    }
}