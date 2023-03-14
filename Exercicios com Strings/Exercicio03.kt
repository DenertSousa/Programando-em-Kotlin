/*Este programa solicita o nome do usuário e imprime-o na vertical.*/

fun main () {

    println("Informe o seu nome: ")
    var name = readLine()!!.uppercase()

    var n = name.length

    for (i in 0 until n) {
        println(name[i]) 
    }
}