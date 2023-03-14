/*Este programa verifica se há um número cadastrado no sistema.
Caso sim, ele confirma o número para o usuário; caso não, ele oferece a opção de cadastrar um número.*/

fun main ()
{
    var numCellPhone: String? = null
    if (numCellPhone == null)
    {
        println("O usuário não cadastrou nenhum número. Deseja cadastrar? (s: sim | n: não)")
        var answer = readLine()
        if (answer == "s")
        {
            println("OK, digite o número do seu telefone (apenas números)")
            numCellPhone = readLine()
            println("Número cadastrado com sucesso")
        } else
        {
            println("Tudo bem, estamos encerrando o aplicativo. Até Breve")
        }
    } else {
        println("Numéro cadastrado encontrado.")}

    println("O seu número é $numCellPhone. Até logo")
}
