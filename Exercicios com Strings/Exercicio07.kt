/*Este programa recebe uma frase informada pelo usuário (incluindo espaços em branco), e conta:

a) quantos espaços em branco existem na frase;
b) quantas vezes aparecem as vogais a, e, i, o, u.*/

fun main () {

    var listaDeLetras = mutableListOf<Char>()

    println("Escreva uma frase qualquer: ")
    var input = readLine()?.lowercase()

    if (input == null) {

    } else {
        for (i in 0 until input.length ) {
            listaDeLetras.add(input[i])
        }

        var listaDeLetrasA = mutableListOf<Char>()
        var listaDeLetrasE = mutableListOf<Char>()
        var listaDeLetrasI = mutableListOf<Char>()
        var listaDeLetrasO = mutableListOf<Char>()
        var listaDeLetrasU = mutableListOf<Char>()
        var espacosVazios = mutableListOf<Char>()
        var carcteresEspeciais = mutableListOf<Char>()


        listaDeLetras.filterTo(listaDeLetrasA) {it == 'a'}
        listaDeLetras.filterTo(listaDeLetrasE) {it == 'e'}
        listaDeLetras.filterTo(listaDeLetrasI) {it == 'i'}
        listaDeLetras.filterTo(listaDeLetrasO) {it == 'o'}
        listaDeLetras.filterTo(listaDeLetrasU) {it == 'u'}
        listaDeLetras.filterTo(espacosVazios) {it == ' ' }

        println("A frase que você digitou tem:\n\n" +
                "${listaDeLetrasA.size} letra(s) \"A\"\n" +
                "${listaDeLetrasE.size} letra(s) \"E\"\n" +
                "${listaDeLetrasI.size} letra(s) \"I\"\n" +
                "${listaDeLetrasO.size} letra(s) \"O\"\n" +
                "${listaDeLetrasU.size} letra(s) \"U\"\n" +
                "${espacosVazios.size} espaços\n")
    }
}