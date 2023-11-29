package models

enum class TipoDroide(val energia: Int) {
    SW447(50), SW348(100), SW4421((100..150).random())
}