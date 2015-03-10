// Hamster.scala
class Hamster {
  def speak():String = { "squeak!" }
  def exercise():String = {
    speak() + " Running on wheel"
  }
}

val hamster = new Hamster
val e1 = hamster.exercise()
assert(
  "squeak! Running on wheel" == e1,
  "Expected squeak! Running on wheel" +
  ", Got " + e1)
