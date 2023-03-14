/*Este aplicativo tem um construtor Empregado que inicializa com tres atributos
* (primeiro nome, sobrenome, salário) e tem um método get e set para cada atributo. Ele também
* possui um método que aumenta o salário de um funcionário em 10%.  */

fun main() {

    var empregadoA: Empregado = Empregado("João", "Cardoso")
    var empregadoB: Empregado = Empregado("Maria", "Melo", 2000.0)
    var empregadoC: Empregado = Empregado("Tadeu","Sousa",1500.0)

    println("""
        O salário do(a) ${empregadoA.getfirstName()} é de R$ ${empregadoA.getwage()}
        O salário do(a) ${empregadoB.getfirstName()} é de R$ ${empregadoB.getwage()}
        O salário de(a) ${empregadoB.getfirstName()} é de R$ ${empregadoC.getwage()}
        """.trimIndent())

    empregadoC.increaseWage(empregadoC.getwage())

    println("O funionário(a) ${empregadoC.getfirstName()} recebeu um aumento de 10% no seu salário\n" +
            "Portanto, o seu novo salário é de R$ ${empregadoC.getwage()}")
}

class Empregado constructor (var firstName: String, var lastName: String, var wage: Double = 0.0) {

    fun getfirstName(): String {
        return this.firstName
    }
    fun getlastName(): String {
        return this.lastName
    }
    fun getwage(): Double {
        return this.wage
    }
    fun setInformation(firstName: String, lastName: String, wage: Double){
        this.firstName = firstName
        this.lastName = lastName
        this.wage = wage
    }
    fun increaseWage(wage: Double) {
        var newWage = wage + ((wage*10)/100)
        this.wage = newWage
    }
}
