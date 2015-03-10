// Reduce.scala
import com.atomicscala.AtomicTest._

val v = Vector(1, 10, 100, 1000)
v.reduce((sum, n) => sum + n) is 1111
