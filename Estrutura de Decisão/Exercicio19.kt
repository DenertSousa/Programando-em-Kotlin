/*Este programa que lê um número natural menor que 999 e
imprima a quantidade de centenas, dezenas e unidades do mesmo. */

fun main () {

    println("Insira uma número inteiro entre 1 e 999:")
    var num = readLine()!!.toInt()

    when {
        num > 999 -> {
            println("O número que você digitou é maior que 999.\n" +
                    "Por favor, reinicie o programa, e entre com valores validos!")
        }
        num < 1 -> {
            println("O número que você digitou é menor que 1.\n" +
                    "Por favor, reinicie o programa, e entre com valores validos!")
        }
        else -> {
            var numCentena = num / 100
            var numDezena = (num / 10) - (10 * numCentena)
            var numUnidade = num - ((10 * numDezena) + (100 * numCentena))

            println("""O número $num tem:
        
        $numUnidade unidade(s)
        $numDezena dezena(s)
        $numCentena centena(s)
    """.trimMargin())
        }
    }
}