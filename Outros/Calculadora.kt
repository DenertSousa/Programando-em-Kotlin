fun main() {

    var calculator: Calculator = Calculator()

    println("Inicializando Calculadora...\n\n" +
           "**************CALCULADORA*******************\n" +
           "Insira um valor: ")
    var input1 = readLine()!!.toDouble()
    println("Insira um outro valor: ")
    var input2 = readLine()!!.toDouble()


    calculator.setTwoValues(input1, input2)
    println("A soma entre $input1 e $input2 é ${calculator.sum()}")
    println("O produto entre $input1 e $input2 é ${calculator.product()}")
    println("A divisão de $input1 por $input2 é ${calculator.divison()}")
    println("Subtraindo $input2 de $input1 dá ${calculator.subtract()}")
}

class Calculator constructor () {

    var x: Double = 0.0
    var y: Double = 0.0

    fun sum(): Double{
        return x + y
    }

    fun product(): Double{
        return x * y
    }

    fun divison(): Double? {

            if (y == 0.0) {
              println("Impossível, pois não existe divisão por zero!")
                return null
            } else {
                return x / y
            }
    }

    fun subtract(): Double {
        return x - y
    }

    fun setTwoValues(x: Double, y: Double) {
        this.x = x
        this.y = y
    }

}