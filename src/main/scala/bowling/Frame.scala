package bowling

case class Frame(roll: Roll, score: Int = 0, nbRoll : Int = 0){

    def launchRoll() : Frame = {
        val nroll = this.roll.launch()
        //if strike
        if(nroll.pinsKnocked == 10 && this.score < 30){
            val nScore = this.score + 10
            val nNbRoll = nbRoll + 1
            this.copy(roll = Roll(), score = nScore, nbRoll = nNbRoll).launchRoll()
        //if spare
        }else if(nroll.pinsLeft == 0){
            val nScore = this.score + nroll.pinsKnocked
            val nNbRoll = nbRoll + 1
            this.copy(roll = Roll(), score = nScore, nbRoll = nNbRoll).launchRoll()
        //if first roll
        }else if(nbRoll == 0){
            val nScore = this.score + nroll.pinsKnocked
            val nNbRoll = nbRoll + 1
            this.copy(roll = nroll, score = nScore, nbRoll = nNbRoll).launchRoll()
        }else{
            val nScore = this.score + nroll.pinsKnocked
            val nNbRoll = nbRoll + 1
            this.copy(roll = nroll, score = nScore, nbRoll = nNbRoll)
        }
    }
}