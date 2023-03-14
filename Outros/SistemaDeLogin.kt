
fun main() {

    println("Seja bem vindo ao nosso site")
    welcome1()
}

class Registration()
{
    private var email: String = ""
    private var keyword: String = ""


    fun verifyLogin (email: String, keyword: String) {

        if ((this.email == email) && (this.keyword == keyword)) {
             println("Entrando no sistema...")
        }  else if ((this.email == email) && (this.keyword != keyword)) {
             println("Usuário cadastrado no sistema, mas senha incorreta. Verifique-a e tente novamente")
        }  else if ((this.email != email) && (this.keyword != keyword)) {
             println("Usuário não cadastrado no sistema. Vamos então fazer o cadastro\n" +
                     "Insira um email: ")
             var input3 = readLine()!!.toString()
             println("Insira uma senha forte: ")
             var input4 = readLine()!!.toString()

             setRegistration(input3, input4)
             println("Cadastro realizado com sucesso!")

             welcome2()
         }

    }

    fun setRegistration (email: String, keyword: String)
    {
        this.email = email
        this.keyword = keyword
    }

    fun getEmail (): String
    {
        return this.email

    }

    fun getKeyword (): String
    {
        return this.keyword

    }
}


fun welcome1()
{
    var userA: Registration = Registration()

    println("Insira o email e a senha abaixo para logar:")

    print("Email: \n")
    var input1 = readLine()!!.toString()

    print("Senha: \n")
    var input2 = readLine()!!.toString()

    userA.verifyLogin(input1, input2)
}

fun welcome2()
{
    var userA: Registration = Registration()

    println("Carregando a tela inicial...\n" +
            "Insira o email e a senha abaixo para logar:")

    print("Email: \n")
    var input5 = readLine()!!.toString()

    print("Senha: \n")
    var input6 = readLine()!!.toString()

    userA.verifyLogin(input5, input6)

}




