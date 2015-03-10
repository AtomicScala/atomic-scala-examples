// ParameterizedTypes.scala
import com.atomicscala.AtomicTest._

// Type is inferred:
val v1 = Vector(1,2,3)
val v2 = Vector("one", "two", "three")
// Exactly the same, but explicitly typed:
val p1:Vector[Int] = Vector(1,2,3)
val p2:Vector[String] =
  Vector("one", "two", "three")

v1 is p1
v2 is p2
