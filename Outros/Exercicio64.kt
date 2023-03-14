/* Este programa lê um array de 3 elementos inteiros, 
 * encontra e mostra o menor elemento e sua posição no array. */

fun main () {
    var numbers: IntArray= IntArray(3)

    for (i in numbers.indices) {
        print("Insira o número quer ficará na posição $i: ")
        var input: Int? = readLine()?.toIntOrNull()

        if ( input != null) numbers[i] = input
    }

    var minValue = Int.MAX_VALUE
    var minIndice = -1

    for (i in numbers.indices) {
        if (numbers[i] < minValue) {
            minValue = numbers[i]
            minIndice = i
        }
    }
    println("O menor valor no array digitado é $minValue e sua posição é $minIndice." )
}