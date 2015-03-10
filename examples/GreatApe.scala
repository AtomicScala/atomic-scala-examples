// GreatApe.scala
import com.atomicscala.AtomicTest._

class GreatApe {
  val weight = 100.0
  val age = 12
}

class Bonobo extends GreatApe
class Chimpanzee extends GreatApe
class BonoboB extends Bonobo

def display(ape:GreatApe) =
  s"weight: ${ape.weight} age: ${ape.age}"
display(new GreatApe) is
"weight: 100.0 age: 12"
display(new Bonobo) is
"weight: 100.0 age: 12"
display(new Chimpanzee) is
"weight: 100.0 age: 12"
display(new BonoboB) is
"weight: 100.0 age: 12"
