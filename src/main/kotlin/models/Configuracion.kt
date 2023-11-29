package models

import kotlin.system.exitProcess

class Configuracion(config: Array<String>) {
    var tam: Int = 0
    var numDroides: Int = 0
    init {
        if (config.size != 2) {
            showErrorMensage()
            println("Solo debes introducir 2 argumentos")
            println("Ejemplo(tam:5 numDroides:10)")
            exitProcess(0)
        } else {
            tam = config[0].trim().toIntOrNull() ?: -1
            numDroides = config[1].trim().toIntOrNull() ?: -1
        }
        if (tam !in 5..9) {
            println("El tamaño de la matriz debe estar entre 5 y 9")
            exitProcess(0)
        } else if (numDroides !in 5..30) {
            println("El numero de droides debe estar entre 5 y 30")
            exitProcess(0)
        }
    }

    private fun showErrorMensage() {
        println("Solo debes introducir 2 argumentos")
        println("Ejemplo: java -jar CloneWars.jar 5 15")
        println("Ejemplo(tamaño:5 numDroides:15)")
        println("El tamaño de la matriz debe estar entre 5 y 9")
        println("El numero de droides debe estar entre 5 y 30")
        exitProcess(0)
    }


}
