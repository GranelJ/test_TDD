package bowling

import org.scalatest.{FunSpec, Matchers}

class RollSpec extends FunSpec with Matchers {
      describe("A Roll"){
      describe("when creates"){
            it("should have 0 pins knocked"){
                val roll = Roll()
                assert(roll.pinsKnocked == 0)
            }
            it("should have 10 pins remaining"){
                val roll = Roll()
                assert(roll.pinsLeft == 10)
            }
      }
      }
}
