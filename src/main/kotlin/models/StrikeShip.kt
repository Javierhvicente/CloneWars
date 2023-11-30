package models

import kotlin.math.round

class StrikeShip(
    private val mapSize: Int = 5,
    private val NumEnemies: Int = 20,
    private val maxTime: Int = 3
) {
    private val map = Array(mapSize){ arrayOfNulls<Droid>(mapSize)}
    private val enemies = Array(NumEnemies){Droid.random()} // almacenamos en un array para pasar la referencia a la matriz
    private val enemiesLeft: Int
        get() = NumEnemies - enemiesDead
    private val enemiesDead: Int
        get() = getTotalEnemiesDead()
    private val numberOfShots: Int = 0
    private val numberOfHits: Int = 0
    private val performance: Double
        get() = getTotalPerformance()

    fun simulation(){
        var time = 0
        palceEnemies()
    }

    private fun palceEnemies() {
        for(row in (0 until mapSize)){
            for(col in (0 until mapSize)){
                if(map[row][col] != null){
                    map[row][col] = null
                }
            }
        }
    }

    private fun printMap(){
        for(row in map){
            for (droid in row){
                if(droid==null){
                    print("[   ]")
                }else{
                    print(droid.color)
                }
            }
        }
    }

    private fun getTotalPerformance(): Double {
        if(numberOfShots == 0){
            return 0.0
        }
        val result = (numberOfHits.toDouble() / numberOfShots.toDouble())
        return round(result * 100) / 100

    }

    private fun getTotalEnemiesDead(): Int {
        var count = 0
        for(enemy in enemies){
            if(!enemy.isAlive()){
                count++
            }
        }
        return count
    }
}