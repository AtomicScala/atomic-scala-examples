// AbstractClasses.scala
import com.atomicscala.AtomicTest._

abstract class Animal {
  def templateMethod =
    s"The $animal goes $sound"
  // Abstract methods (no method body):
  def animal:String
  def sound:String
}

// Error -- abstract class
// cannot be instantiated:
// val a = new Animal

class Duck extends Animal {
  def animal = "Duck"
  // "override" is optional here:
  override def sound = "Quack"
}

class Cow extends Animal {
  def animal = "Cow"
  def sound = "Moo"
}

(new Duck).templateMethod is
"The Duck goes Quack"
(new Cow).templateMethod is
"The Cow goes Moo"
