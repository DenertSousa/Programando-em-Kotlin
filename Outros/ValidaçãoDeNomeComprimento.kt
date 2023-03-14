/*Este aplicativo verifica se o nome do usario é muito longo, se for, ele não registra
* se não for, ele registra normalmente. Utilizamos o conceito de classe e variáveis privadas*/

fun main() {

    var user1: User = User()

    println("O nome cadastrado é: ${user1.getName()} ")

    println("Por favor, cadastre um nome para começarmos: ")
    var input = readLine()!!.toString()
    user1.validationName(input)

    println("O nome cadastrado é: ${user1.getName()}")
}

class User (  ) {

    private val MAX_NAME_LENGTH: Int = 8 
    private var name: String = "Não Informado"


    fun validationName(name: String){

        if (name.length > MAX_NAME_LENGTH) {
            println("Nome muito longo, por favor, reinicie o aplicativo e tente novamente. ")
        } else {
            this.name = name
            println("Nome cadastrado com sucesso!")
        }
    }

    fun getName(): String
    {
        return name
    }

}