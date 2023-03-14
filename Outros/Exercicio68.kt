Este programa permite a leitura das notas de uma turma de 5 alunos. Calcula a média da turma
e conta quantos alunos obtiveram nota acima desta média calculada, e ainda mostra
a média da turma e o resultado da contagem.


fun main () {
    var Notas:  Array<Double?> = arrayOf(0.0, 0.0, 0.0, 0.0, 0.0)
    var count: Int = 0

    for (i: Int in Notas.indices) {
        println("Insira sua nota: ")
        Notas[i] = readLine()!!.toDouble()
    }

    var media: Double = (Notas[0]!! + Notas[1]!! + Notas[2]!! + Notas[3]!! + Notas[4]!!)/5

    Notas.forEach{
        if (it!! >= media) {
            ++count
        }
    }
    println("A média da turma foi: $media. E o número de alunos que obtiveram nota acima da média da turma foi $count")
}