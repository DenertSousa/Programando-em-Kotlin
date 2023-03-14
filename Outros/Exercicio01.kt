fun main ()
{
    print("Escreva um número inteiro: ")
    val number = readLine()!!.toInt()

    println("O antecessor de $number é ${number - 1}" +
                " e o seu sucessor é ${number + 1}")
}