// ParameterizedReturnTypes.scala
import com.atomicscala.AtomicTest._

// Return type is inferred:
def inferred(c1:Char, c2:Char, c3:Char)={
  Vector(c1, c2, c3)
}

// Explicit return type:
def explicit(c1:Char, c2:Char, c3:Char):
  Vector[Char] = {
  Vector(c1, c2, c3)
}

inferred('a', 'b', 'c') is
  "Vector(a, b, c)"
explicit('a', 'b', 'c') is
  "Vector(a, b, c)"
