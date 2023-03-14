/*Este programa recebe o salário de um funcionário,
 calcula e mostra o novo salário, sabendo-se que este sofreu um aumento de 25%.*/

fun main()
{
    println("Insira o seu salário: ")
    var wage = readLine()!!.toInt()
    println("O seu novo salário com o reajuste de 25% é ${reajuste(wage)}")
}

fun reajuste(a: Int): Int
{
    return a + (a * 25/100)
}