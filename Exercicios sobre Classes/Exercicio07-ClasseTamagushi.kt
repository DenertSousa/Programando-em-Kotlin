/* Este programa cria uma classe que modela um Tamagushi (Bichinho Eletrônico):

* a) Esta classe tem os atributos para: Nome, Fome, Saúde e Idade; e funções para:
* alterar Nome, Fome, Saúde e Idade; e funções para retornar Nome, Fome, Saúde e Idade
*
* b) Existe também uma função chamada whatsHumor() que mostra o humor do meu Tamaguishi.
* O humor deste é definido por uma combinação entre os atributos saúde e fome.
*
* 27 de Fevereiro de 2023
* */

fun main () {

    var tamagushiA: Tamagushi = Tamagushi("Dener", 7, 1,5)
    tamagushiA.whatsHumor()

}

class Tamagushi constructor(private var name: String = "Não Informado", private var age: Int = 0, private var hungry: Int = 0, private var health: Int = 0 ){

    init {

        if (age < 0){
            println("O valor mínimo para idade é 0!")
        }

        if (hungry < 1){
            println("O valor mínimo para fome é 1!")
        } else if (hungry > 5){
            println("O valor máximo para a fome é 5!")
        }

        if (health < 1) {
            println("O valor mínimo de saúde possível é 0")
        } else if (health > 5) {
            println("O valor máximo de saúde possível é 5")
        }
    }

    fun getName(): String {
        return this.name
    }

    fun getAge(): Int {
        return this.age
    }

    fun getHealth(): Int {
        return this.health
    }

    fun getHungry(): Int {
        return this.hungry
    }

    fun changeName (newName: String) {
        this.name = newName
    }

    fun changeHealth (newHealth: Int) {
        if (newHealth < 1) {
            println("O valor mínimo de saúde possível é 0")
        } else if (newHealth > 5){
            println("O valor máximo de saúde possível é 5")
        } else {
            this.health = newHealth
        }
    }

    fun changeHungry(newHungry: Int) {
        if (newHungry < 1){
            println("O valor mínimo para fome é 0!")
        } else if (newHungry > 5){
            println("O valor máximo para a fome é 5!")
        } else {
            this.hungry = newHungry
        }
    }

    fun changeAge(newAge: Int) {
        if (newAge < 0){
            println("O valor mínimo para idade é 0!")
        } else {
            this.age = newAge
        }
    }

    fun whatsHumor(): Unit {
        var humor: Int = this.health + this.hungry

        when  {
            humor >= 9 -> {println("${this.name} está muito feliz")}
            humor < 9 && humor >=7 -> {println("${this.name} está  feliz")}
            humor < 7 && humor >= 5 -> {println("${this.name} está indiferente")}
            humor < 5 && humor >= 3 -> {println("${this.name} está triste")}
            humor < 3 -> {println("${this.name} está péssimo.")}
        }
    }
}