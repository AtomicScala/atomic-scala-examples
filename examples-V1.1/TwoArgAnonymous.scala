// TwoArgAnonymous.scala
import com.atomicscala.AtomicTest._

val v = Vector(19, 1, 7, 3, 2, 14)
v.sorted is Vector(1, 2, 3, 7, 14, 19)
v.sortWith((i, j) => j < i) is
Vector(19, 14, 7, 3, 2, 1)
