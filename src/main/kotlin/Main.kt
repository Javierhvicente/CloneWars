import models.Configuracion
import models.Cuadricula

fun main(args: Array<String>) {
    val config = Configuracion(args)
    val cuadricula=Cuadricula()
    println("${config.tam}")
    println("${config.numDroides}")
    println(cuadricula)
}