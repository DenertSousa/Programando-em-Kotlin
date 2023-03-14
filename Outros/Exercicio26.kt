/*Este programa recebe o ano de nascimento de uma pessoa e o ano atual e calcula e mostra:
 *A idade dessa pessoa em anos; A idade dessa pessoa em meses; A idade dessa pessoa em dias;
 *A idade dessa pessoa em semanas */

fun main ()
{
    println("Por favor, insira o ano de seu nascimento: ")
    val birthYear = readLine()!!.toInt()

    println("Agora, preciso que insire o ano atual: ")
    val currentYear = readLine()!!.toInt()

    val yearsOld = currentYear - birthYear
    val monthsOld = yearsOld * 12
    val daysOld = yearsOld * 365
    val weeksOld = yearsOld * 48

    println("""
        Você tem, aproximadamente,
        $yearsOld anos de idade
        $monthsOld meses de idade
        $daysOld dias de idade
        $weeksOld semanas de idade
    """.trimIndent())
}