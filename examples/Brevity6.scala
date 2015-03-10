// Brevity6.scala
import com.atomicscala.AtomicTest._

def explicitReturnType():Vector[Int] =
  Vector(11, 22, 99, 34)

explicitReturnType() is
  Vector(11, 22, 99, 34)

def inferredReturnType() =
  Vector(11, 22, 99, 34)

inferredReturnType() is
  Vector(11, 22, 99, 34)

def unitReturnType() {
  Vector(11, 22, 99, 34)
}

unitReturnType() is (())
