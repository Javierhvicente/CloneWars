package models

import kotlin.system.exitProcess

class Configuration(val mapSize: Int = 5, val NumDroids: Int = 20, val time: Int = 3 ) {
    companion object{
        fun fromArgs(args: Array<String>): Configuration{
            if(args.size != 3){
                showErrorMensage()
            }
            val mapSize: Int = args[0].trim().toIntOrNull() ?: -1
            val NumDroids: Int = args[1].trim().toIntOrNull() ?: -1
            val time: Int = args[2].trim().toIntOrNull() ?: -1
            if(mapSize !in (5..9) || NumDroids !in (5..30) || time !in (1..3)){
                showErrorMensage()
            }
            return Configuration(mapSize, NumDroids)
        }
        private fun showErrorMensage() {
            println("Invalid arguments")
            println("Use: Java -jar CloneWars.jar <mapSize> <NumDroids> <time>")
            exitProcess(-1)
        }
    }




}
