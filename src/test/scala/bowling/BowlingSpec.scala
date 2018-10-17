package bowling

import org.scalatest.{FunSpec, Matchers}

class BowlingSpec extends FunSpec with Matchers {
    describe("A Set") {
        describe("when empty") {
        it("should have size 0") {
            assert(Set.empty.size == 0)
        }

        it("should produce NoSuchElementException when head is invoked") {
            assertThrows[NoSuchElementException] {
            Set.empty.head
            }
        }
        }
    }

    
    describe("A Frame"){
        describe("when knock 0 pins"){
        it("should have a score of 0"){
            val frame = Frame(Roll())
            val nFrame = frame.launchRoll()
            assert(nFrame.score == 0)
        }
        }

        describe("when strike every roll"){
        it("should have a score of 30"){

        }
        }

        describe("when knock 1 pins at each roll"){
        it("should have a score of 2"){

        }
        }
    }
}
