fun main() {

        var vida1 = Vida.Animais.AnimaisTerrestres("Cachorro")
        var vida2 = Vida.Plantas("Orquídea")
        var vida3 = Vida.Animais.AnimaisAquaticos("Tubarão Branco")
        var vida4 = Vida.Animais.AnimaisAereos("Coruja")

        vida1.alimentar()
        vida1.respirar()
        vida1.desenvolver()
    }

    abstract class Vida (protected var nome: String, private var seLocomove: Boolean) {

        abstract fun respirar()

        fun locomover() {
            if (seLocomove) {
                // a condição aqui fica implicita que é pra quando for "true"
                println("$nome está se locomovendo")
            } else {
                println("$nome não é um tipo de vida que se locomove")
            }
        }

        abstract fun alimentar(): Boolean

        fun desenvolver (){
            if (alimentar()) {
                println("O(a) $nome está se desenvolvendo")
            } else {
                println("O(a) $nome não esta se desenvolvendo, precisa se alimentar!")
            }
        }
        
        abstract class Animais (nome: String): Vida(nome, true) {

            override fun respirar (): Unit = println("O $nome está respirando com oxigênio")

            open class AnimaisTerrestres constructor(nome: String): Animais(nome) {
                override fun alimentar(): Boolean {
                    println("O $nome não está se alimentando de ração")
                    return false
                }
            }
            
            open class AnimaisAquaticos constructor(nome: String): Animais(nome){
                override fun alimentar(): Boolean {
                    println("O $nome não está se alimentando de algas")
                    return false
                }
            }

            open class AnimaisAereos constructor(nome: String): Animais(nome) {
                override fun alimentar(): Boolean {
                    println("O $nome está se alimentanto de minhocas")
                    return true
                }
            }
        }

        class Plantas (nome: String): Vida(nome, false) {

            override fun respirar (): Unit = println("Realizando fotossíntese")

            override fun alimentar(): Boolean {
                println("A $nome está se alimentando de água e luz")
                return true
            }
        }

        abstract class OrganimosMicroscopicos constructor(nome: String): Vida(nome, true) {

            override fun respirar(): Unit = println("Respirando com enxofre")
        }
    }