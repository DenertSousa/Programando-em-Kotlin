/* Neste programa, são lidos valores para um vetor de 15 elementos inteiros,
além de outro valor, menor que 15, para uma variável n. Após a leitura, o programa
desloca os elementos para a esquerda tantas posições quantas indicadas por n.
Os elementos que são deslocados para fora do vetor são ser recolocados na outra extremidade.*/


fun main () {

    var lista: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    var n: Int = 6

    println("A nossa lista inicial é: ")
    lista.forEach { println(it) }

    for (i: Int in lista.indices) {
        if (i <=5)
            lista[i - n + 15] = lista[i]
        else
            lista[i - n] = lista[i]
    }

    println("Agora, a nossa lista, com cada elemento deslocado 6 para esquerda, é")
    lista.forEach{ println(it) }
}