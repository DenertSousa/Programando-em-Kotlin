/*Este programa recebe um número digitado pelo teclado e utiliza uma função para
* invertê-lo. */


fun main (){
    print("Informe um número inteiro qualquer:  ")
    val num: String = readLine()!!.toString()

    print("O número $num de trás para frente fica: ${numberReversed(num)}")
}

fun numberReversed (a: String): String {
    return a.reversed() // essa função é um uma função para os tipos String
}