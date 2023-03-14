/*Este programa possui uma classe TV abstrata que contém atributos e funções de uma TV
* normal. Essa classe possui duas classes herdeiras, Samsung e LG, que herdam os atributos
* e funções de uma TV normal. Cada herdeira tem sua propria função.*/

/*OBS:  Eu percebi que para todas as funções que serão executadas eu precisei verificar se a tv
* estaria ligada. Precio ver alguma maneira para tentar não repetir o codigo.*/

import java.util.Date

fun main (){

    var television1: Television= Television.SamsungTelevision ()

    television1.turnOnTV()
    television1.changeChannel("2")
    television1.turnUpVolume()
    television1.changeChannel("9")
    television1.changeChannel("21")
    television1.turnOffTV()
    television1.changeChannel("2")
    television1.turnUpVolume()
    television1.homeButton()
}

abstract class Television {

    protected var volume: Int = 0
    protected var isOn: Boolean = false

    abstract fun homeButton ()

    fun turnOnTV() {

        if (isOn == false) {
            isOn = true
            println("Ligando a TV")
        } else {
            println("A TV já está ligada.")
        }
    }

    fun turnOffTV () {
        if (isOn == true) {
            isOn = false
            println("Desligando a TV.")
        } else {
            println("A TV já esta desligada")
        }
    }

    fun turnUpVolume () {

        if (isOn == false) {
            println("A TV está desligada, ligue a TV primeiro para depois aumentar o seu volume")
        } else {
            if (volume < 100) {
                ++volume
                println("Volume: $volume")
            } else {
                println("O volume está no máximo: $volume!")
            }
        }
    }

    fun turnDownVolume () {

        if (isOn == false) {
            println("A TV está desligada, ligue a TV primeiro para depois diminuir o seu volume.")
        } else {
            if (volume > 0) {
                --volume
                println("Volume: $volume")
            } else {
                println("O volume está no mínimo: $volume!")
            }
        }
    }

    fun changeChannel (numberChannelChoosed: String) {

        val channelsAvailable = mapOf (
            "2" to "TV Globo",
            "5" to "RedeTV",
            "4" to "RecordTV",
            "9" to "SBT",
            "11" to "BandTV",
            "13" to "TV Cultura",
        )
        var channel = channelsAvailable.getOrDefault(numberChannelChoosed, "None")

        if (isOn == false) {
            println("A TV está desligada! Não é possível mudar de canal.")
        } else {
            if (channel == "None") {
                println("Não existe esse canal!")
            } else {
                println("Mudando para o canal $channel")
            }
        }
    }

    class SamsungTelevision : Television() {

        fun showTime () {
            if (isOn == false) {
                println("A TV está desligada! Não é possível mostrar a hora. ")
            } else {
                var data1: Date = Date()
                println(data1)
            }
        }

        override fun homeButton() {
            if (isOn == false) {
                println("A TV está desligada! Não é possível acessar o botão Home.")
            } else {
                println(
                    """
                HDMI1     HDMI2      HDMI Lateral
            """.trimIndent())
            }
        }
    }

    class LGTelevision : Television() {

        var isOnAudio3D: Boolean = false

        override fun homeButton() {

            if (isOn == false) {
                println("A TV está desligada! Não é possível acessar o botão Home.")
            } else {
            println("""
                Youtube   Internet   NetFLix
                
                HDMI1     HDMI2      HDMI Lateral
            """.trimIndent())
            }
        }

        fun turnOnAudio3D () {

            if (isOn == false) {
                println("A TV está desligada! Não é possível ativar o audio 3D.")
            } else {
            if (isOnAudio3D == true) {
                println("O audio 3D já está ativado!")
            } else {
                isOnAudio3D = true
                println("Ativando o audio 3D.")
                }
            }
        }

        fun turnOffAudio3D () {

            if (isOn == false) {
                println("A TV está desligada! Não é possível desativar o audio 3D.")
            } else {
            if (isOnAudio3D == false ) {
                println("O audio 3D já está desligado")
            } else {
                isOnAudio3D = false
                println("Desativando audio 3D!")
                }
            }
        }
    }

    fun verifyTVisON (operation: () -> Unit) {

        if (isOn == false ) {
            println("A TV está desligada! Não é possível executar a ação desejada ")
        } else {
            operation()
        }
    }
}