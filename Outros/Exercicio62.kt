Este programa lê e mostra um array de 20 elementos inteiros e conta quantos valores pares existem no array.

fun main () {

    val lista: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    var count: Int = 0

    lista.forEach { number ->

        if (number % 2 == 0) ++count
    }

    println("O número de elementos da minha coleção que são pares é: $count" )
}
