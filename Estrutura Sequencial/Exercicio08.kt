/*Este programa pergunta o quanto que você ganha por hora e o número de horas trabalhadas no mês. 
Calcula e mostra o total do seu salário no referido mês.*/

fun main (){

    println("Quanto você ganha por hora?")
    var wagePerHour = readLine()!!.toInt()
    println("Quantas horas você trabalhou por mês? ")
    var hoursWorked = readLine()!!.toInt()

    println("O Seu salário no mês é R$ ${wagePerHour * hoursWorked}")
}