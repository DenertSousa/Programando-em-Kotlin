/*Este programa trabalha com números complexos */

import kotlin.math.sqrt
import kotlin.math.atan
import kotlin.math.PI

fun main() {


    var numComplexZ: Complex = Complex()
    var numComplexW: Complex = Complex()
    var numComplexP: Complex = Complex(realPart = 2, imaginaryPart = 2)


    println("************************************* NÚMEROS COMPLEXOS ********************************************\n\n" +
            "Definição: os números complexos (ou números Imaginários): são  números da forma geral a + bi, em que\n" +
            "\t1) i (Unidade Imaginária) é definida como: i² = -1;\n" +
            "\t2) a (Parte Real) pertence ao conjunto dos números reais;\n" +
            "\t3) b (Parte Imaginária) é diferente de zero e pertecem ao conjunto dos números reais.\n" +
            "____________________________________________________________________________________________________\n\n" +
            "Agora que você sabe a definição dos complexos, imagine dois complexos:\n" +
            "z = a + bi;\n" +
            "w = x + yi;\n")
    println("Para o complexo z\n" +
            "Insira o valor de a: ")
    var a = readLine()!!.toInt()
    println("Insira o valor de b: ")
    var b = readLine()!!.toInt()
    println("Para o complexo w\n" +
            "Insira o valor de x: ")
    var x = readLine()!!.toInt()
    println("Insira o valor de y: ")
    var y = readLine()!!.toInt()


    numComplexZ.setComplexNum(a, b)
    numComplexW.setComplexNum(x, y)

    println("""
        Número complexo: ${numComplexZ.showLinearForm()} 
        Módulo: ${numComplexZ.getModuleComplex()}
        Argumento: ${numComplexZ.getArgumentComplex()}°
        Forma trigonométrica: ${numComplexZ.showTrigonometryForm()}
        ___________________________________________________________
        
        Número complexo: ${numComplexW.showLinearForm()} 
        Módulo: ${numComplexW.getModuleComplex()}
        Argumento: ${numComplexW.getArgumentComplex()}°
        Forma trigonométrica: ${numComplexW.showTrigonometryForm()}
        ___________________________________________________________
        
        Número complexo: ${numComplexP.showLinearForm()} 
        Módulo: ${numComplexP.getModuleComplex()}
        Argumento: ${numComplexP.getArgumentComplex()}°
        Forma trigonométrica: ${numComplexP.showTrigonometryForm()}
        
        ___________________________________________________________
        
        A soma do complexo ${numComplexP.showLinearForm()} com ${numComplexZ.showLinearForm()} é ${numComplexP.getSumComplexTo(numComplexZ.getRealpart(), numComplexZ.getImaginarypart())}
        O produto do complexo ${numComplexW.showLinearForm()} com ${numComplexP.showLinearForm()} é ${numComplexW.getProductComplexTo(numComplexP.getRealpart(), numComplexP.getImaginarypart())}
        A divisão do complexo ${numComplexZ.showLinearForm()} por ${numComplexW.showLinearForm()} é ${numComplexZ.getDivisionComplexFor(numComplexW.getRealpart(), numComplexW.getImaginarypart())}
        
           
    """.trimIndent())
}

class Complex constructor (private var realPart: Int = 0, private var imaginaryPart: Int = 0) {


    fun setComplexNum (realPart: Int, imaginaryPart: Int) {

        this.imaginaryPart = imaginaryPart
        this.realPart = realPart
    }

    fun getRealpart (): Int {
        return this.realPart
    }
    fun getImaginarypart (): Int {
        return this.imaginaryPart
    }

    fun getModuleComplex (): Double {

        var a = this.realPart.toDouble()
        var b = this.imaginaryPart.toDouble()

        return sqrt((a*a) + (b*b))
    }

    fun getArgumentComplex (): Double {

        var cosx: Double = (this.realPart) / getModuleComplex()
        var sinx: Double =  (this.imaginaryPart) / getModuleComplex()

        var tgx =  sinx/cosx
        var atgx = atan(tgx)

        fun radToDegree(radian: Double): Double
        {
            return (180 * radian) / PI
        }

        return radToDegree(atgx)
    }

    fun getSumComplexTo(x: Int, y: Int): String {
        return "${this.realPart + x} + ${this.imaginaryPart + y}i"
    }

    fun getProductComplexTo(x: Int, y: Int): String {
        return "${(this.realPart * x) - (this.imaginaryPart * y)} + ${(this.realPart * y) + (this.imaginaryPart * x)}i"
    }

    fun getDivisionComplexFor(x: Int, y: Int): String {
        return "${((this.realPart * x) + (this.imaginaryPart * y))/((x*x) + (y*y))} + ${((this.imaginaryPart * x)-(this.realPart * y))/((x*x) + (y*y))}i"
    }

    fun showLinearForm(): String {
        return "${getRealpart()} + ${getImaginarypart()}i"
    }

    fun showTrigonometryForm(): String {
        return "${getModuleComplex()} [cos(${getArgumentComplex()}°) + i sin (${getArgumentComplex()}°"
    }
}