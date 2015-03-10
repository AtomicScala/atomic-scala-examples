// Sum.scala
import com.atomicscala.AtomicTest._

val v = Vector(1, 10 , 100, 1000)
var sum = 0
v.foreach(x => sum += x)
sum is 1111
