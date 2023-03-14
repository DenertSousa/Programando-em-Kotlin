/* Este programa lê e valida as seguintes informações:

a)Nome: maior que 3 caracteres;
b)Idade: entre 0 e 150;
c)Salário: maior que zero;
d)Sexo: 'f' ou 'm';
e) Estado Civil: 's', 'c', 'v', 'd';

O programa somente para de ser excecutado quando todas as informações inseridas pelo usuário atende
condições acima.

9 de Março de 2023
*/


fun main (){

    var name: String? = ""
    var age: Int? = 0
    var wage: Double? = 0.0
    var sex: String? = ""
    var status: String? = ""

    while (true) {

        println("Insira o seu nome (mínimo 3 caracteres): ")
        name = readLine()

        if (name != null) {
            if (name.length < 3 ) {
                println("O nome que você informou não tem a quantidade mínima de caracteres necessária.\n" +
                        "Vamos retornar o programa para o início. ")
                continue
            }
        } else {
            println("O que você digitou não foi reconhecido pelo programa.\n" +
                    "\"Vamos retornar o programa para o início.")
            continue
        }

        println("Informe sua idade (Entre 1 e 150 anos):")
        age = readLine()!!.toIntOrNull()

        if (age != null) {
            if (age < 1 || age > 150) {
                println("A idade que você informou não está dentro da faixa de valores aceitável (1 e 150).\n" +
                        "Vamos retornar o programa para o início.")
                continue
            }
        } else {
            println("O que você digitou não é  um número!\n" +
                    "Vamos retornar o programa para o início.")
            continue
        }

        println("Informe o seu sálario, em R$ (maior que zero):")
        wage = readLine()!!.toDoubleOrNull()

        if (wage != null) {
            if (wage <= 0.0) {
                println("O salário informado deve ser maior do que zero!\n" +
                        "Vamos retornar o programa para o início.")
                continue
            }
        } else {
            println("O que você digitou não é um número!\n" +
                    "Vamos retornar o programa para o início.")
            continue
        }

        println("Informe o seu sexo, apertando a tecla correspondente)\n" +
                "(m: masculino | f: feminino):")
        sex = readLine()

        if (sex!!.lowercase() == "m" || sex!!.lowercase() == "f") {

        } else {
            println("O sexo informado não existe!\n" +
                    "Vamos retornar o programa para o início.")
            continue
        }

        println("Qual é o seu Estado Civil?\n" +
                "s: solteiro(a)\n" +
                "c: casado(a)\n" +
                "v: viúvo(a)\n" +
                "d: divorciado")
        status = readLine()

        when(status!!.lowercase()) {
            "s" -> break
            "c" -> break
            "v" -> break
            "d" -> break
            else -> {
                println("O Estado Civil informado não existe\n" +
                        "Vamos retornar o programa para o início.")
                continue
            }
        }
    }

    var sexo = mapOf <String, String> (
        "m" to "Masculino",
        "f" to "Feminino"
    )

    var estadoCivil = mapOf <String, String> (
            "s" to "Solteiro",
            "c" to "Casado",
            "v" to "Viúva",
            "d" to "Divorciado"
            )

    println("""
        Suas informações são:
         
        Nome:                          $name
        Idade:                         $age
        Salário (R$):                  $wage
        Sexo:                          ${sexo.get(sex)}
        Estado Civil:                  ${estadoCivil.get(status) }
        --------------------------------------------
    """.trimIndent())

}