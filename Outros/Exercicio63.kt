Este programa lê dois arrays de 10 posições e faz a multiplicação dos elementos de mesmo índice, colocando o resultado em um terceiro array, mostrando o array resultante.

fun main () {
    var lista1: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var lista2: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var lista3: Array<Int> = arrayOf(0,0,0,0,0,0,0,0,0,0)

    lista3[0] = lista1[0] * lista2[0]
    lista3[1] = lista1[1] * lista2[1]
    lista3[2] = lista1[2] * lista2[2]
    lista3[3] = lista1[3] * lista2[3]
    lista3[4] = lista1[4] * lista2[4]
    lista3[5] = lista1[5] * lista2[5]
    lista3[6] = lista1[6] * lista2[6]
    lista3[7] = lista1[7] * lista2[7]
    lista3[8] = lista1[8] * lista2[8]
    lista3[9] = lista1[9] * lista2[9]

    lista3.forEach { println(it) }
}