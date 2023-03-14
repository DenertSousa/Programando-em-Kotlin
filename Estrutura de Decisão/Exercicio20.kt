/*Este programa pede três notas de um aluno e calcula, no final, a média, dizendo se
* foi ou não aprovadao. */

fun main () {

    println("Insira a primeira nota: ")
    var grade1: Double? = readLine()!!.toDoubleOrNull()
    println("Insira a segunda nota: ")
    var grade2: Double? = readLine()!!.toDoubleOrNull()
    println("Insira a terceira nota: ")
    var grade3: Double? = readLine()!!.toDoubleOrNull()

    if (grade1 == null || grade2 == null || grade3 == null) {

        println("Uma das notas que você inseriu não é válida. Por isso, não poderemos calcular sua média\n" +
                "Por favor, reinicie o programa e tente novamente com valores válidos.")
    } else {
        var average: Double = (grade1 + grade2 + grade3)/3

        if (average < 7.0) {
            println("A média obtida foi de: $average\n" +
                    "Infelizmente, você não conseguiu atingir a média necessária para a aprovação.")
        } else {
            if (average == 10.0) {
                println("A média obtida foi de: $average\n" +
                        "Parabéns! Você foi aprovado com distinção.")
            } else {
                println("A média obtida foi de: $average\n" +
                        "Parabéns! Você conseguiu atingir a média necessária para a aprovação.")
            }
        }
    }
}