package models

import kotlin.system.exitProcess

class Configuracion(config: Array<String>) {
    var tam: Int = 0
    var numDroides: Int = 0
    init {
        if (config.size != 2) {
            println("Solo debes introducir 2 argumentos")
            println("Ejemplo(tam:5 numDroides:10)")
            exitProcess(0)
        } else {
            tam = config[0].split(":")[1].toInt()
            numDroides = config[1].split(":")[1].toInt()
        }
        if (tam !in 5..9) {
            println("El tamaño de la matriz debe estar entre 5 y 9")
            exitProcess(0)
        } else if (numDroides !in 5..30) {
            println("El numero de droides debe estar entre 5 y 30")
            exitProcess(0)
        }
    }


}
