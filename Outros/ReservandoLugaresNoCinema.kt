// Este programa reserva lugares de uma unica fila de poltronas para um cinema

fun main () {
    val seatsAvaliable = mutableListOf("A1", "A2", "A3", "A4", "A5","A6","A7", "A8", "A9", "A10")


    while (true){

        showSeatsAvailable(seatsAvaliable)

        if (isFullBooked(seatsAvaliable)) {
            println("Desculpe, todos os assentos já foram reservados!")
            break
        }

        println("Informe a letra e o número do assento do assento que você quer reservar: ")
        var seatChoosed = readLine()?.uppercase()

        if (isThisSeatBooked(seatChoosed, seatsAvaliable)) {
            println("Desculpe, o assento escolhido já foi reservado!")
            continue
        } else {
            println("Assento reservado com sucesso!")
        }

        println("Gostaria de reservar um outro assento? (s | n)")
        var input = readLine()?.lowercase()

         if (input == "s") {
             println("Entendido")
             continue
         } else {
             showSeatsAvailable(seatsAvaliable)
             println("Obrigado! Tenha um ótimo filme!")
             break
         }
    }
}

fun isFullBooked (seats: MutableList<String>): Boolean {

    if (seats[0] == "---" && seats[1] == "---" && seats[2] == "---" && seats[3] == "---" && seats[4] == "---" && seats[5] == "---" && seats[6] == "---" && seats[7] == "---" && seats[8] == "---" && seats[9] == "---") {
        return true
    }
    return false
}

fun isThisSeatBooked (seatChoosed: String?, seats: MutableList<String>): Boolean {

    for (i in seats.indices) {
        if (seatChoosed == seats[i]) {
            seats[i] = "---"
            return false
        }
    }
    return true
}

fun showSeatsAvailable (seatsAvaliable: MutableList<String>) {
    println(
        """
        [${seatsAvaliable[0]}] [${seatsAvaliable[1]}] [${seatsAvaliable[2]}] [${seatsAvaliable[3]}] [${seatsAvaliable[4]}] [${seatsAvaliable[5]}] [${seatsAvaliable[6]}] [${seatsAvaliable[7]}] [${seatsAvaliable[8]}] [${seatsAvaliable[9]}]
        ______________________________________________________
                             TELA
        ______________________________________________________
    """.trimIndent()
    )
}