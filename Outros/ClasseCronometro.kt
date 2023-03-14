/*É um programa que estabelece um cronômetro,
* e um método para inicia esse cronometro.
*
* 23 de Fevereiro de 2023*/



fun main () {
    
    var cronometer: Cronometer = Cronometer(0,71,42)
    println("Agora é ${cronometer.hour} h, ${cronometer.minute} min, e ${cronometer.second} s")
    cronometer.startCronometer()
}

class Cronometer constructor (var hour: Int, var minute: Int, var second: Int) {

    init {
        if (second > 60) {
            minute = minute + second / 60
            second = second % 60
        }

        if (minute > 60 ) {
            hour = hour + minute / 60
            minute = minute % 60
        }

        if (hour > 24) {
            println("A cronometragem que você escolheu passa de um dia!")
        }
    }


    fun startCronometer() {

        while (true) {
            if (this.second > 0) {
                --this.second

            } else {
                if (this.minute > 0) {
                    --this.minute
                    this.second = 59

                } else {
                    if (this.hour > 0) {
                        --this.hour
                        this.minute = 59
                        this.second = 59

                    } else {
                        break
                    }
                }
            }
            println("Agora é ${this.hour} h, ${this.minute} min, e ${this.second} s")
        }
    }
}
