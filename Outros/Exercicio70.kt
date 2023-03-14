/* Este programa lê um array de 10 números inteiros e
gera um segundo array cujas os elementos nas posições pares são o dobro dos
elementos na posição do array original; as ímpares; o triplo. */

fun main () {
    var lista1: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var lista2: Array<Int> = arrayOf(0,0,0,0,0,0,0,0,0,0)

    for (i in 0..9) {
        lista2[i] = 2 * lista1[i]
    }

    lista2.forEach{
        println(it)
    }
}