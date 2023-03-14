/*Este programa recebe duas notas, calcula e mostra a média ponderada destas,
 *considerando peso 2 para a primeira nota e peso 3 para a segunda nota. */

fun main ()
{
    println("Ok, vamos calcular a média pondera de suas notas.\n" +
            "Digite a primeira nota:")
    var nota1 = readLine()!!.toFloat()

    println("Digite a segunda nota: ")
    var nota2 = readLine()!!.toFloat()

    var media = (nota1*2 + nota2*3)/5
    println("A média pondera entre essas duas notas é ${"%.2f".format(media)}")
}