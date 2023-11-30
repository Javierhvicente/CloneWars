package models
class Droid private constructor(
    val type: Type,
    val maxEnergy: Int,
    val defense: Int,
    val speed: Int,
    val shield: Int) {

    enum class Type {
        SW447, SW348, SW421
    }

    companion object {
        fun random(): Droid {
            val random = (1..100).random()
            return when {
                random <= 30 -> Droid(Type.SW348, 50, 0, 0, (5..10).random())
                random >= 80 -> Droid(Type.SW421, (100..150).random(), 0, (10..30).random(), 0)
                else -> {
                    Droid(Type.SW447, 100, (9..12).random(), 0, 0)
                }
            }
        }
    }

    fun isAlive(): Boolean{
        return maxEnergy > 0
    }

    override fun toString(): String {
        return "Droid(maxEnergy=$maxEnergy, type=$type, defense=$defense, speed=$speed, shield=$shield)"
    }
    val color: String
    get(){
        return when(type){
            Type.SW348 -> "[\uD83D\uDD34]"
            Type.SW421 -> "[\uD83D\uDD35]"
            Type.SW447 -> "[\uD83D\uDFE2]"
        }
    }

}