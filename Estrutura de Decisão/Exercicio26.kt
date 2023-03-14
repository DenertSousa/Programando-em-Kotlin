/* Este programa oferece duas opçoes de combustível, e oferece um desconto baseado
 * no tipo de combustível e quantidade de litros escolhida pelo usuário. */

fun main () {
    
    println("Qual o combustível que você deseja?\n" +
            "(A - Alcool | G - Gasolina)\n" +
            "* Tecle a letra corresponde ao combustível desejado.")
    var fuelChoosed = readLine()?.uppercase()
    println("Qual a quantidade, em litros, que você deseja?")
    var fuelAmountChoosed = readLine()!!.toDouble()
    

        when (fuelChoosed) {
            "A" -> {
                if (fuelAmountChoosed <= 20.0) {
                    println("Você tem um desconto de 3%")
                    println("O valor final a ser pago é : 3% de ${ fuelAmountChoosed * 1.90}, isto é: R$ ${ fuelAmountChoosed * 1.90  * 0.97}")
                } else {
                    println("Você tem um desconto de 5%")
                    println("O valor final a ser pago é: 5% de ${fuelAmountChoosed * 1.90}, ísto é: R$ ${fuelAmountChoosed * 1.90  * 0.95}")
                }
            }
            "G" -> {
                if (fuelAmountChoosed <= 20.0) {
                    println("Você tem um desconto de 4%")
                    println("O valor final a ser pago é : 3% de ${ fuelAmountChoosed * 2.50}, isto é:  R$ ${ fuelAmountChoosed * 2.50  * 0.96}")
                } else {
                    println("Você tem um desconto de 6%")
                    println("O valor final a ser pago é: 5% de ${fuelAmountChoosed * 2.50}, ísto é: R$ ${fuelAmountChoosed * 2.50  * 0.94}")
                }

            }
        }
}