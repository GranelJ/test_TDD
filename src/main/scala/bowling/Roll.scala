package bowling

import scala.util.Random

case class Roll(pinsKnocked : Int = 0, pinsLeft : Int = 10){
    val r : Random = Random
    def launch() : Roll = {
        val npinsKnocked = r.nextInt(pinsLeft) + 1
        val npinsLeft = this.pinsLeft - npinsKnocked
        val nRoll = this.copy(pinsKnocked = npinsKnocked, pinsLeft = npinsLeft)
        return nRoll
    }
}