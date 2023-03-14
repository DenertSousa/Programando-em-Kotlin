/*Este programa faz um pesquisa sobre qual é o melhor sistema operacional. No final, ele imprime 
a quantidade de votos que cada sistema operacional recebeu o mais votado, a quantidade de votos recebidas por ele,
e a porcentagem de todos os votos, e a porcentagem do mais votado. */

fun main () {

    var survey: MutableList<Int> = mutableListOf()
    var optionOne: MutableList<Int> = mutableListOf()
    var optionTwo: MutableList<Int> = mutableListOf()
    var optionThree: MutableList<Int> = mutableListOf()
    var optionFour: MutableList<Int> = mutableListOf()
    var optionFive: MutableList<Int> = mutableListOf()
    var optionSix: MutableList<Int> = mutableListOf()

    do {
        println("""
        Qual é o melhor Sistema Operacional para uso em servidores?
        
        1 - Windows Server
        2 - Unix
        3 - Linux
        4 - Netware
        5 - Mac OS
        6 - Outro
            """.trimIndent()
        )
        var input: Int = readLine()!!.toInt()
        if (input in 1..6) {
            survey.add(input)
        } else if (input <= -1 || input >=7){
            println("Este número que você escolheu não é válido.")
        }
    } while (input != 0)

    survey.filterTo(optionOne){it == 1}
    survey.filterTo(optionTwo){it == 2}
    survey.filterTo(optionThree){it == 3}
    survey.filterTo(optionFour){it == 4}
    survey.filterTo(optionFive){it == 5}
    survey.filterTo(optionSix){it == 6}


    var surveyFinalResult: MutableList<Int> = mutableListOf(optionOne.size, optionTwo.size, optionThree.size, optionFour.size, optionFive.size, optionSix.size)
    var mostVoted = Int.MIN_VALUE
    var systemMostVotedIndice = 0


    for (i in surveyFinalResult.indices) {
        if (surveyFinalResult[i] >= mostVoted) {
            mostVoted = surveyFinalResult[i]
            systemMostVotedIndice = i
        }
    }

    var systemMostVoted: String = when ( systemMostVotedIndice) {
            0  ->  "Windows Server"
            1  ->  "Unix"
            2  ->  "Linux"
            3  ->  "Netware"
            4  ->  "Mac Os"
            5  ->  "Outro"
            else -> ""
    }

    println("""
        Sistema Operacional             Votos                   % 
        -------------------            -------                -----
        
        WindowsServer                 ${optionOne.size}             ${optionOne.size * 100 / survey.size} %  
        Unix                          ${optionTwo.size}             ${optionTwo.size * 100 / survey.size} %    
        Linux                         ${optionThree.size}           ${optionThree.size * 100 / survey.size} %   
        Netware                       ${optionFour.size}            ${optionFour.size * 100 / survey.size} %  
        Mac OS                        ${optionFive.size}            ${optionFive.size * 100 / survey.size} %  
        Outro                         ${optionSix.size}             ${optionSix.size * 100 / survey.size} %  
        -------------------            ------- 
        Total                         ${survey.size}
        
        O Sistema Operacional mais votado foi o $systemMostVoted, com $mostVoted, correspondendo a ${mostVoted * 100 /survey.size} dos votos
    """.trimIndent())
}
