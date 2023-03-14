/* Este programa recebe uma matriz 3x3 informada pelo usuário, e calcula o
 * seu determinante.
 * Data: 19 de Fevereiro de 2023*/

fun main () {
    var matriz = arrayOf(
        doubleArrayOf(0.0, 0.0, 0.0),
        doubleArrayOf(0.0, 0.0, 0.0),
        doubleArrayOf(0.0, 0.0, 0.0),
    )

    var numberOfElementsAlowed = 0 // variável sentinela que limita o número de elementos inserido na matriz 3x3.

    println("Dado uma matriz 3x3 de números inteiros, informe os elementos a seguir: ")
    while (numberOfElementsAlowed < 9) {

        // Aqui será a mostrada a matriz atual; a medida que os elementos são inseridos, os elementos são atualizados.
        println("""
        | ${matriz[0][0]}  ${matriz[0][1]}  ${matriz[0][2]} | 
        | ${matriz[1][0]}  ${matriz[1][1]}  ${matriz[1][2]} | 
        | ${matriz[2][0]}  ${matriz[2][1]}  ${matriz[2][2]} |
        """.trimIndent())
        

        println("Informe a linha do elemento que você deseja inserir (1 a 3):")
        var row = readLine()!!.toIntOrNull()
        println("Informe a coluna do elemento que você deseja inserir (1 a 3):")
        var col = readLine()!!.toIntOrNull()

        //Aqui terá uma função que verifica se a linha e a coluna escolhida pelo usuário é possível numa matriz 3x3
            // caso não, mandar voltar o programa.

        if (row == null || col == null) { // aqui será verificado se a linha ou coluna que o usuário digitou é número. 
            println("A linha ou a coluna que você digitou não é um número.")
            continue
        } else {
            if (!isPostitionAlowed(row, col)) { // aqui é chamada uma função que retorna um Boleano que será verifica se o número da linha ou coluna que o usuário digitou é possível numa matriz 3x3 
                println("A posição escolhida não é permitida, escolha uma linha, ou uma colunda, dentro da faixa de valores permitidas.")
                continue
            }

            println("Informe o elemento que você deseja inserir:")
            var element = readLine()!!.toDoubleOrNull()

            if (element == null) { // aqui será verificado se o elemento que o usuário deseja inserir é, de fato, um número. Caso não, ele não insere na matriz e volta o programa.
                println("O elemento que você digitou não é um número!\n" +
                        "Portanto, não tem como inseri-lo na matriz. ")
                continue
            } else {
                matriz[row - 1][col - 1] = element // aqui será inserido o elemento na matriz na posião escolhida pelo usuário.
                ++numberOfElementsAlowed // incrementa váriavel numberOfElementAlowed em 1.
            }
        }
    }
    
    //aqui será calculado o determinante. 
    var determinant = ((matriz[0][0] * matriz[1][1] * matriz[2][2] ) + (matriz[0][1] * matriz[1][2] * matriz[2][0]) + (matriz[1][0]* matriz[2][1] * matriz[0][2])) -
            ((matriz[0][2] * matriz[1][1] * matriz[2][0]) +  (matriz[0][1]* matriz[1][0] * matriz[2][2]) + (matriz[1][2] * matriz[2][1] * matriz[0][0]))


    println("""
        O determinante da matriz:
        | ${matriz[0][0]}  ${matriz[0][1]}  ${matriz[0][2]} | 
        | ${matriz[1][0]}  ${matriz[1][1]}  ${matriz[1][2]} |  é    $determinant 
        | ${matriz[2][0]}  ${matriz[2][1]}  ${matriz[2][2]} |
    """.trimIndent())

}

fun isPostitionAlowed (row: Int, col: Int): Boolean { // função que verifica  verifica se o número da linha ou coluna que o usuário digitou é possível numa matriz 3x3.

    if (row < 1 || row > 3) {
        return false
    }

    if (col < 1 || row > 3) {
        return false
    }
    return true
}