/*Este aplicativo calcula e apresenta o valor do volume (em centímetros) de um
 * cilíndro*/

import kotlin.math.PI


fun main() 
{
	println("Vamos calcular o volume de um cilíndro!\n" +
		"Informe o raio r, em cm (centímetros), do sólido: ")
	val r = readLine()!!.toDouble()
	
	println("Informe a altura, em cm (centímetros), do sólido: ")
	var h = readLine()!!.toDouble()

	val v = r*r*h*PI
	println("O volume do cilíndro é ${"%.2f".format(v)} cm³")
}