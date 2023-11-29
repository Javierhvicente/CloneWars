package models
class Droide private constructor(type: Type, maxEnergy: Int, defense: Int, speed: Int, shield: Int) {

    enum class Type {
        SW447, SW348, SW421
    }

    companion object {
        fun random(): Droide {
            val random = (1..100).random()
            return when {
                random <= 30 -> Droide(Type.SW348, 50, 0, 0, (5..10).random())
                random >= 80 -> Droide(Type.SW421, (100..150).random(), 0, (10..30).random(), 0)
                else -> {
                    Droide(Type.SW447, 100, (9..12).random(), 0, 0)
                }
            }
        }
    }

}