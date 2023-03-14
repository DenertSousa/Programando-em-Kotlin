/*Classe Retangulo: Este programa cria uma classe que modela um retângulo que :

A) possue os atrtributos: LadoA, LadoB;
B) possue as seguintes funções: Mudar valor dos lados, Retornar valor dos lados,
calcular Área; calcular Perímetro; Calucar Diagonal; Verificar se um retângulo é um quadrado,
verificar se um retângulo é igual a um outro;
 -----------------------------------------------*/

import kotlin.math.sqrt

fun main (){

    var rectangleA: Rectangle = Rectangle(2.5f, 2.6f)
    var rectangleB: Rectangle = Rectangle(7.0f, 7.0f)
    var rectangleC: Rectangle = Rectangle(2.5f, 2.6f)
    var rectangleD: Rectangle = Rectangle(2.6f, 2.5f)


    println(rectangleA.calculateArea())

    println(rectangleC.calculatePerimeter())

    rectangleB.isSquare()

    rectangleA.isEqualTo(rectangleC)

    rectangleA.isEqualTo(rectangleD)

    println(rectangleB.calculateDiagonal())

}

data public class Rectangle constructor ( private var sideA: Float = 0.0f, private var sideB: Float = 0.0f ) {


    fun changeSides (newSizeA: Float, newSizeB: Float) {
        sideA = newSizeA
        sideB = newSizeB
    }

    fun TakeSideA (): Float  {
        return sideA
    }

    fun TakeSideB (): Float {
        return sideB
    }

    fun calculateArea (): Float {
        return sideA * sideB
    }

    fun calculatePerimeter (): Float {
        return 2 * (sideA + sideB)
    }

    fun calculateDiagonal (): Float {
        return sqrt((sideA*sideA) + (sideB*sideB))
    }

    fun isSquare () {

        if (sideA == sideB) {
            println("Este retângulo é um quadrado.")
        } else {
            println("Este retângulo não é um quadrado.")
        }
    }

    fun isEqualTo(rectangle: Rectangle) {

       when {
           sideA == rectangle.sideA -> {
               if (sideB == rectangle.sideB) {
                   println("Os dois retângulos são iguais!")
               } else {
                   println("Os dois retângulos são diferentes!")
               }
           }

           sideA == rectangle.sideB -> {
               if (sideB == rectangle.sideA) {
                   println("Os dois retângulos são iguais!")
               } else {
                   println("Os dois retângulos são diferentes")
               }
           }
           else -> println("Os dois retângulos são diferentes!")
       }
    }
}