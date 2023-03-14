/*Este programa pergunta o  quanto você ganha por hora e o número de horas 
trabalhadas no mês. Calcula e mostra o total do seu salário no referido mês, 
sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato. */

fun main (){

    var wageTaxe: Double = 11.0 / 100.0
    var inssTaxe: Double = 8.0/ 100.0
    var sindicateTaxe: Double = 5.0 / 100.0

    print("Olá, informe o quanto você ganha, em R$, por horas trabalhadas: ")
    var wagePerHour: Double = readLine()!!.toDouble()
    print("Quanto de horas você trabalhou no mês?\nInforme aqui: ")
    var hoursWorked: Double = readLine()!!.toDouble()

    var finalSalary: Double = wagePerHour * hoursWorked * (1 - wageTaxe - inssTaxe - sindicateTaxe)

    println("""
        _________________________________________________________________
        + Salário Bruto: R$ ${wagePerHour * hoursWorked}
        - IR (11 %): R$ ${wagePerHour * hoursWorked * wageTaxe}
        - INSSS (8 %): R$ ${wagePerHour * hoursWorked * inssTaxe}
        - Sindicato (5 %): R$ ${wagePerHour * hoursWorked * sindicateTaxe}
        -----------------------------------------------------------------
        = Salário Líquido: R$ $finalSalary
    """.trimIndent())

}