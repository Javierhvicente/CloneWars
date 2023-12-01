package models

import kotlin.math.min

class Droid private constructor(
    val type: Type,
    var maxEnergy: Int,
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

    fun defend(damage: Int): Int {
        check(this.type == Type.SW348){"This type of droid can´t defend"}
        println("Enemy defends with value $defense")
        return min(defense, damage)
    }

    fun move(): Boolean {
        check(this.type == Type.SW421){"This dorid can´t dodge"}
        println("Enemy dodge the shot with $speed")
        return (1..100).random() <= speed

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