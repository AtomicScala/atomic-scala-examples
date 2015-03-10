// AerobicExercise.scala
import com.atomicscala.AtomicTest._

trait Aerobic {
  val age:Int
  def minAerobic = .5 * (220 - age)
  def isAerobic(heartRate:Int) =
    heartRate >= minAerobic
}

trait Activity {
  val action:String
  def go:String
}

class Person(val age:Int)

class Exerciser(age:Int,
  val action:String = "Running",
  val go:String = "Run!") extends
  Person(age) with Activity with Aerobic

val bob = new Exerciser(44)
bob.isAerobic(180) is true
bob.isAerobic(80) is false
bob.minAerobic is 88.0
