/*Este programa lê um número inteiro entre 1 e 9, e desenha, na tela,
 * o número digitado usando o asterístico (*) */

fun main ()
{
    println("Digite um número inteiro entre  1 e 9: ")
    var num = readLine()!!.toInt()

    if (num == 1) {
        println("""
            *
          * *
        *   *
            *
            *
            *
        *********
        """)
    } else if (num == 2) {
        println("""
        *********
                *
                *  
        *********
        *
        *
        *********  
        """)
    } else if (num == 3) {
        println("""
        *********
                *
                *  
        *********
                *
                *
        *********  
        """)
    } else if (num == 4) {
        println("""
        *       *
        *       *
        *       *  
        *********
                *
                *
                *  
        """)
    } else if (num == 5) {
        println("""
        *********
        *
        *  
        *********
                *
                *
        *********  
        """)
    } else if (num == 6) {
        println("""
        *********
        *
        *  
        *********
        *       *
        *       *
        *********  
        """)
    } else if (num == 7) {
        println("""
        *********
                *
                *  
            ********
                *
                *
                *  
        """)
    } else if (num == 8) {
        println("""
        *********
        *       *
        *       *
        *********
        *       *
        *       *
        *********  
        """)
    } else if (num == 9) {
        println("""
        *********
        *       *
        *       *
        *********
                *
                *
                *  
        """)
    } else {
        println("Você digitou um número não permitido, por favor, reinicie o programa " +
            "e digite um número de 1 a 9, necessariamente")
    }

}