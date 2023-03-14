import java.util.Date

fun main() {

    var date: Calendar = Calendar()
    println("Vamos estabelecer uma data.\n" +
            "Insira um dia:  ")
    var d = readLine()!!.toInt()
    println("Insira um mês: ")
    var m = readLine()!!.toInt()
    println("Insira um ano: ")
    var y = readLine()!!.toInt()

    date.setADate(d)
    date.setAMonth(m)
    date.setAyear(y)
}


class Calendar constructor(private var date: Int = 0,  private var month: Int = 0,  private var year: Int = 0) {

    init {
        if ((date > 0) && (date <= 30)) {
            println("O valor do dia armazenado com sucesso!")
        } else {
            println("O valor do dia inserido é inválido")
            date = 0
        }

        if ((month > 0) && (month <=12)) {
            println("O valor do mês armazenado com sucesso!")
        } else {
            println("O valor do mês inserido é inválido")
            month = 0
        }

        if (year > 0) {
            println("O valor do ano armazenado com sucesso!")
        } else {
            println("O valor do ano inserido é inválido")
            year = 0
        }
    }

    fun getDate (): Int {
        return this.date
    }

    fun getMonth (): Int {
        return this.month
    }

    fun getYear (): Int {
        return this.year
    }

    fun showDate(){
        println("A data é: $date\\$month\\$year")
    }

    fun setADate (date: Int) {
        if ((date > 0) && (date <= 30)) {
            this.date = date
        } else {
            println("O valor do dia inserido é inválido")
        }
    }

    fun setAMonth (month: Int) {
        if ((month > 0) && (month <=12)) {
            this.month = month
        } else {
            println("O valor do mês inserido é inválido")
        }
    }

    fun setAyear (year: Int) {
        if (year > 0) {
            this.year = year
        } else {
            println("O valor do ano inserido é inválido")
        }
    }

    fun advanceCalendarOneDay() {

        if (this.date < 30) {
            ++this.date
        } else {
            if (month < 12){
                this.date = 1
                ++this.month
            } else {
                this.date = 1
                this.month = 1
                ++this.year
            }
        }
    }

    fun showSystemDate() {
        val date = Date()
        print(date)
    }
}