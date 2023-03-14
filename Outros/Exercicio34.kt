/*Este programa lê dois números e efetua a adição entre eles.
 Caso o valor somado seja maior que 20, este deverá ser apresentado somando-se a ele mais 8;
 Caso o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.
 */

fun main()
{
    mostrarMensagem1()
    var num1 = readLine()!!.toInt()
    mostrarMensagem2()
    var num2 = readLine()!!.toInt()
    soma(num1, num2)
}

fun soma(a: Int, b: Int): Unit
{
    if ((a + b) > 20)
    {
        println("O valor retornado é ${a + b + 8}")
    } else
    {
        println("O valor retornado é ${a + b - 5}")
    }
}

fun mostrarMensagem1()
{
    println("Por favor, insira o primeiro número: ")
}

fun mostrarMensagem2()
{
    println("Por favor, insira o segundo número: ")
}