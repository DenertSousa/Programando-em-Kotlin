/*Este programa lê 20 números inteiros e armazena-os num array.
Armazena os números pares num array  PAR e os números IMPARES no array impar.
E Imprime os três vetores.*/

fun main (){

    var integerList = IntArray(20)

    for (i in integerList.indices){
        println("Insira um número inteiro: ")
        integerList[i] = readLine()!!.toInt()

    }

    var integerEvenNumber = integerList.filter { it % 2 == 0 }
    var integerOddNumber = integerList.filterNot { it % 2 == 0}

    println("Lista de números inteiros:" + integerList.contentToString())
    println("Lista de números inteiros pares: $integerEvenNumber")
    println("Lista de números inteiros ímpares: $integerOddNumber")
}