import models.Configuration
import models.StrikeShip

fun main(args: Array<String>) {
    println("THE CLONE WARS")
    val config = Configuration.fromArgs(args)
    val strike = StrikeShip(config.mapSize, config.NumDroids, config.time)
    strike.simulation()
    println()
    strike.report()
}
