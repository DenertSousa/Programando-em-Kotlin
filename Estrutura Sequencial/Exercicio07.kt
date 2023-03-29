/*Este programa que calcula a área de um quadrado, e, em seguida, mostra
 o dobro desta área para o usuário.*/

fun main () {

    println("Informe o lado do quadro que você deseja calcular a área: ")
    var l: Double? = readLine()!!.toDoubleOrNull()

    if (l != null) {
        println("""
            A área do quadrado é ${l * l} u.a (unidade de área)
            O dobro dessa área é ${2 * l * l} u.a (unidade de área)
        """.trimIndent())
    } else {
        println("O que você informou não é um núemero\n" +
                "Portanto, não podemos calcular a área.")
    }
}