/* Este programa faz 5 perguntas para uma pessoa sobre um crime. E de acordo com a quantidade
 * de "sim" para as perguntas é emitido um relatório final se ela é, inocente, suspeito, cumplice ou autor.*/

fun main () {

    println("Telefonou para a vítima? (s ou n)")
    var input1: String? = readLine()
    println("Esteve no local do crime? (s ou n)")
    var input2: String? = readLine()
    println("Mora perto da vítima? (s ou n)")
    var input3: String? = readLine()
    println("Devia para a vítima? (s ou n)")
    var input4: String? = readLine()
    println("Já trabalhou com a vítima? (s ou n)")
    var input5: String? = readLine()
    crimeParticipationVerification(input1, input2, input3, input4, input5)
}

fun crimeParticipationVerification(a: String?, b: String?, c: String?, d: String?, e: String?): Unit{

    var participationDegree: Int = 0

    if (a == "s") {
        participationDegree += 1
    }
    if (b == "s") {
        participationDegree += 1
    }
    if (c == "s") {
        participationDegree += 1
    }
    if (d == "s") {
        participationDegree += 1
    }
    if (e == "s") {
        participationDegree += 1
    }

    if (participationDegree == 0) {
        println("Você foi considero(a) inocente.")
    }
    if (participationDegree in 1 ..2) {
        println("Você foi considero(a) suspeito(a).")
    }
    if (participationDegree in 3..4) {
        println("Você foi considero(a) cúmplice.")
    }
    if (participationDegree == 5) {
        println("Você foi considero(a) como assassino(a). ")
    }
}