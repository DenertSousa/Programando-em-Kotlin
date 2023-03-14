/* Este  programa que recebe a base e a altura de um retângulo
 *e exibe seu perímetro e sua área */

fun main(){

    println("Vamos calcular o perímetro e a área de um retângulo\n" +
            "Informe, a seguir a altura, desse retângulo: ")
    val h = readLine()!!.toDouble()
    println("Agora informe o comprimento da base")
    val b = readLine()!!.toDouble()

    println("""
        O perímetro desse retângulo é ${calcularPerimetro(h , b)} u.a
        A área desse retângulo é ${calcularArea(h, b)} u.a
    """.trimIndent())

}

fun calcularPerimetro(a: Double, b: Double): Double {

    return (2 * a) + (2 * b)
}

fun calcularArea(a: Double, b: Double): Double {

    return a * b
}
