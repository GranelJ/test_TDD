package bowling

import org.scalatest.{FunSpec, Matchers}

class FrameSpec extends FunSpec with Matchers {
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
        describe("when init"){
        it("should have a score of 0"){
            val frame = Frame(Roll())
            assert(frame.score == 0)
        }
        it("should have 0 nbRoll"){
            val frame = Frame(Roll())
            assert(frame.nbRoll == 0)
        }
        }

        describe("when lauch"){
        it("should have a number of roll > 0"){
             val frame = Frame(Roll())
             val nFrame = frame.launchRoll()
             assert(frame.nbRoll > 0)
        }
        }
    }
}
