/*Este programa que lê um nome de usuário e a sua senha e
não aceita a senha igual ao nome do usuário, mostrando uma mensagem de erro
e voltando a pedir as informações.*/


fun main (){
    println("Escolha um nome de usuário para continuar: ")
    var userName = readLine()

    println("Escolha uma senha, lembrando que ela precisa ser diferente do nome do usuário: ")
    var passwordUser = readLine()

    if (passwordUser?.uppercase() == userName?.uppercase()) {
        do {
            println("Desculpe, mas a senha deve ser diferente do usuário")
            println("Escolha senha válida: ")
            var newPasswordUser = readLine()
            passwordUser = newPasswordUser

        } while (newPasswordUser?.uppercase() == userName?.uppercase())
    }
    println("Usuário e senha cadastrado com sucesso!\n" +
            "O usuário é $userName e a senha é $passwordUser, anote para não esquecer ;)")
}
