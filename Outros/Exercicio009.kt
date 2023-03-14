/*Este programa lê o salário base de um funcionário e calcula o valor líquido
* acrescentado de uma gratificação de 5% e descontado um imposto de 7%*/

fun main () {

    println("Por favor, informe o seu salário abaixo:")
    var a: Int = readLine()!!.toInt()
    var aFivePercent: Int = ((a * 5)/100)
    var aTaxes: Int = ((a * 7)/100)
    var aTotal: Int = a + aFivePercent - aTaxes

    println("""
        Salário Base:               R$ $a
        Gratificação de 5%:       + R$ $aFivePercent
        Imposto de 7%:            - R$ $aTaxes
        
        ----------------------------------------------------
        Salário Líquido (Total):    R$ $aTotal
    """.trimIndent())
}