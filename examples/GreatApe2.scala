// GreatApe2.scala
import com.atomicscala.AtomicTest._

class GreatApe(
  val weight:Double, val age:Int)

class Bonobo(weight:Double, age:Int)
  extends GreatApe(weight, age)
class Chimpanzee(weight:Double, age:Int)
  extends GreatApe(weight, age)
class BonoboB(weight:Double, age:Int)
  extends Bonobo(weight, age)

def display(ape:GreatApe) =
  s"weight: ${ape.weight} age: ${ape.age}"

display(new GreatApe(100, 12)) is
"weight: 100.0 age: 12"
display(new Bonobo(100, 12)) is
"weight: 100.0 age: 12"
display(new Chimpanzee(100, 12)) is
"weight: 100.0 age: 12"
display(new BonoboB(100, 12)) is
"weight: 100.0 age: 12"
