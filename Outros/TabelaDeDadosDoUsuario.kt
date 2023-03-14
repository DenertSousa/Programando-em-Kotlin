/* Este programa mostra uma tabelza desatualizada, pede algumas informações para o usuário,
* atualiza a tabela com os novos dados e a imprime novamente atualizada.*/

fun main() {

    var user1: User = User()
    user1.showTable()

    println("Vamos realizar o seu cadastro!\n" +
            "Insira o seu primeito nome: ")
    var input1 = readLine()!!.toString()
    println("Insira o seu sobrenome")
    var input2 = readLine()!!.toString()
    println("Insira um apelido: ")
    var input3 = readLine()!!.toString()
    println("Insira o seu melhor email: ")
    var input4 = readLine()!!.toString()
    println("Insira a senha para esse email: ")
    var input5 = readLine()!!.toString()
    println("Insira sua idade: ")
    var input6 = readLine()!!.toInt()
    println("Insira o seu número de telefone celular (apenas números): ")
    var input7 = readLine()!!.toLong()

    println("Atualizando os dados...")
    user1.setRegistration(input1, input2, input3 , input4, input5, input6, input7)
    user1.showTable()
}

class User ()
{
    var name: String = "Não Informado"
    var lastName: String = ""
    var nickName: String = "Não Informado"
    var email: String = "Não Informado"
    var passWord: String = "Não Informado"
    var age: Int = 0
    var cellPhoneNumber: Long = 0

    fun showTable()
    {
        println("""
            ********* TABELA DE DADOS DO USUARIO **********
            Nome completo: $name $lastName | Apelido: $nickName
            Idade: $age
            Email Profissional: $email     | Senha: $passWord
            Número de Telefone Celular: $cellPhoneNumber
            ________________________________________________
        
            
        """.trimIndent())
    }

    fun setRegistration(name: String, lastName: String, nickName: String, email: String, passWord: String, age: Int, cellPhoneNumber: Long)
    {
        this.name = name
        this.lastName = lastName
        this.nickName = nickName
        this.email = email
        this.passWord = passWord
        this.age = age
        this.cellPhoneNumber = cellPhoneNumber
    }

}