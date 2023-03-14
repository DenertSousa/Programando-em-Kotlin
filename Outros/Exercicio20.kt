/*Este programa calcula o décimo termo de uma P.A a partir da razão, e do primeiro termo,
 * digitado pelo usuário */

fun main ()
{
    println("OK, vamos calcular o 10º (décimo) termo de uma P.A (Progressão Geométrica)\n" +
            "Digite a razão da P.A: ")
    var r = readLine()!!.toInt()

    println("Certo, agora digite o primeiro termo dessa P.A: ")
    var a1 = readLine()!!.toInt()

    var a10 = a1 + (9 * r)
    println("O décimo termo dessa P.A é $a10")
}