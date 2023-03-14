/* Este programa  carrega um array de 7 elementos inteiros e verifica a existência
de elementos iguais a 30, mostrando as posições em que esses elementos apareceram. */

fun main () {

    var lista: Array<Int> = arrayOf(30,21,30,22,23,30,24)

    for (i: Int in lista.indices) {
        if (lista[i] == 30) println("O número 30 aparece nas posição $i")
    }

}