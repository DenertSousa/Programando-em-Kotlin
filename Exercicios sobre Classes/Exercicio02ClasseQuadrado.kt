/* Classe Quadrado: Crie uma classe que modele um quadrado:

a) Atributos: Tamanho do lado;
b) Métodos: Mudar valor do Lado, Retornar valor do Lado, Estabelecer um novo lado, calcular Área
calcular a diagonal, calcular o perimetro;

9 de Março de 2023
 */

import kotlin.math.sqrt

fun main () {

    var squareA: Square = Square(-4.6)
    squareA.setSize(8.8)
    println(squareA.calculateArea())


}

class Square constructor(private var size: Double = 0.0) {

    init {
        if (this.size < 0.0) {
            println("Não existe lado negativo!\n" +
                    "Portanto, o valor do lado será estabelecido como 0 (zero)")
            this.size = 0.0
        }
    }

    fun calculateDiagonal(): Double {
        return sqrt(2 * this.size * this.size)
    }

    fun calculatePerimeter(): Double {
        return 4 * this.size
    }

    fun calculateArea(): Double {
        return this.size * this.size
    }

    fun changeSize (newSize: Double) {

        if (newSize < 0.0) {
            println("Não existe lado negativo!\n" +
                    "Portanto, o valor do novo lado será estabelecido como 0 (zero)")
            this.size = 0.0
        } else {
            this.size = newSize
        }
    }

    fun setSize(size: Double) {

        if (size < 0.0) {
            println("Não existe lado negativo!\n" +
                    "Portanto, o valor do lado será estabelecido como 0 (zero)")
            this.size = 0.0
        } else {
            this.size = size
        }
    }

    fun getSize(): Double {
        return this.size
    }
}