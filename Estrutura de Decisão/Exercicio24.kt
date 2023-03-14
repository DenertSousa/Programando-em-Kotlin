/*Este programa lê 2 números e em seguida pergunta ao usuário qual operação ele deseja realizar.
O resultado da operação será acompanhado de uma frase que diga se o número é:
1. par ou ímpar;
2. positivo ou negativo;
Este programa também faz tratamento de exceções de divisões por zero*/

fun main () {

    println("Informe um número inteiro: ")
    var num1 = readLine()!!.toIntOrNull()
    println("Informe um outro número inteiro: ")
    var num2 = readLine()!!.toIntOrNull()

    if (num1 == null || num2 == null) {
        println("O que você digitou não é um número, portanto, não podemos continuar com o programa. " +
                "Reinicie e tente novamente.")
    } else {

        print(
            """
        Qual é a operação que você deseja realizar?
        
        1. Digite "+" para somar os números escolhidos;
        2. Digite "-" para subtrair os números  escolhidos;
        3. Digite "x" para multiplicar os números escolhidos;
        4. Digite "/" para dividir os números escolhidos.
        -------------------------------------------
        Digite aqui: 
        """.trimIndent()
        )
        var operationChoosed = readLine()

        when (operationChoosed) {
            "+" -> {
                println("\n\nA soma entre $num1 e $num2 é ${num1 + num2}")
                isEvenOrOdd(num1 + num2)
                isPositiveOrNegative(num1 + num2)
            }
            "-" -> {
                println("A subtração entre $num1 e $num2 é ${num1 - num2}")
                isEvenOrOdd(num1 - num2)
                isPositiveOrNegative(num1 - num2)
            }
            "x" -> {
                println("A multiplicação entre $num1 e $num2 é ${num1 * num2}")
                isEvenOrOdd(num1 * num2)
                isPositiveOrNegative(num1 * num2)
            }
            "/" -> {
                if (num2 == 0) {
                    if (num1 == 0) {
                        println("Desculpe, mas essa divisão não é possível. Zero divido por zero é uma indefinição " +
                                "matemática!\nReinicie o programa e tente novamente com valores validos.")
                    } else {
                    println("Desculpe, mas essa divisão não é possível. Divisão por zero não existe!\n" +
                            "Reinicie o programa e tente novamente com valores validos.")
                    }
                } else {
                    println("A divisão entre $num1 e $num2 é ${num1 / num2}")
                    isEvenOrOdd(num1 / num2)
                    isPositiveOrNegative(num1 / num2)
                }
            }
            else -> println("Desculpe, a operação que você digitou não existe, reinicie o programa e tente novamente " +
                    "com uma operação válida.")
        }
    }
}

fun isEvenOrOdd (a: Int) {

    if (a % 2 == 0) {
        println("$a é um número par")
    } else {
        println("$a é um número ímpar.")
    }
}

fun isPositiveOrNegative(a: Int){

    if (a > 0) {
        println("$a é um número positivo")
    } else {
        println("$a é um número negativo")
    }
}