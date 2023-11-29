package models
const val SPAWN_SW348 = 30
const val SPAWN_SW4421 = 80
class Cuadricula (configuracion: Configuracion, configDroide: ConfigDroide) {
    val cuadricula: Array<Array<TipoDroide?>> = Array(configuracion.tam){Array(configuracion.tam){null} }
    val config=configuracion

    fun randomTipoDroide(){
        if((0..100).random()<= SPAWN_SW348){
            print("[A]")
        }else if((0..100).random()>= SPAWN_SW4421){
            print("[P]")
        }else{
            print("[Z]")
        }

    }

    fun randomPosition(): IntArray{
        val i=(0..<config.tam).random()
        val j=(0..<config.tam).random()
        val posiciones: IntArray= IntArray(2){0}
        posiciones[0]=i
        posiciones[1]=j
        return posiciones
    }

    fun initCuadricula(){
        for (i in cuadricula.indices){
            for (j in cuadricula[i].indices){
                    print("[ ]")
                }
            println()
            }
        }

    }

}