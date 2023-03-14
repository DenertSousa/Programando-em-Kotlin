/*Escreva um algoritmo que receba três valores e verifique se eles
podem ser os comprimentos dos lados de um triângulo.*/

fun main ()
{
    println("Considere um triângulo de lados A, B e C.\n" +
            "Informe o comprimento do lado A: ")
    var ladoA = readLine()!!.toInt()

    println("Informe o comprimento do lado B: ")
    var ladoB = readLine()!!.toInt()

    println("informe o comprimento do lado C: ")
    var ladoC = readLine()!!.toInt()

    if (ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoA + ladoB))
    {
        if (ladoA == ladoB && ladoB == ladoC)
        {
            println("O triângulo existe, e é um triângulo equilátero!")
        }
        else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC)
        {
            println("O triângulo existe, e é um triângulo isóleces!")
        } else
        {
            println("O triângulo existe, e é um triângulo escaleno!")
        }
    } else {
        println("Os valores informados não consitutiem um triângulo!")
    }
}
