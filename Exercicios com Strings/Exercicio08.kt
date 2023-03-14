/* Este programa lê uma sequência de caracteres, mostra-os e diga se é um palíndromo ou não.

OBS: Um palíndromo é uma sequência de caracteres cuja leitura é idêntica
se feita da direita para esquerda ou vice−versa. Por exemplo: OSSO e OVO são palíndromos.
Em textos mais complexos os espaços e pontuação são ignorados.
A frase SUBI NO ONIBUS é o exemplo de uma frase palíndroma onde os espaços foram ignorados.

20 de Fevereio de 2023*/

fun main () {
    var text = mutableListOf<Char>() // aqui vai o texto sem espaços em branco
    var textReversed = mutableListOf<Char>() // aqui vai o texto ao contrário sem espaço em branco

    println("Escreva uma palavra ou um texto: ")
    var input = readLine()
    var inputReversed = input?.reversed()

    if (input != null && inputReversed != null) {
        for (i in input.indices) {
            if (input[i] != ' ') {
                text.add (input[i])
            }
            if (inputReversed[i] != ' ') {
                textReversed.add ( inputReversed[i])
            }
        }

        var o = "None"

        for (i in text.indices) {
            if (text[i] != textReversed[i]) {
                 o = "O"
            }
        }

        if (o == "O") {
            println("O que você escreveu não é um palímodro.")
        } else {
            println("O que você escreveu é um palímodro, isto é, \"$input\", de traz para frente fica \"$inputReversed\"")
        }
    }
}