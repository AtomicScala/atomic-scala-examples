// VectorCollection.scala
import com.atomicscala.AtomicTest._

val v1 = Vector(19.2, 88.3, 22.1)
v1 is Vector(19.2, 88.3, 22.1)
v1(1) is 88.3 // Indexing
v1.reverse is Vector(22.1, 88.3, 19.2)
v1.sorted is Vector(19.2, 22.1, 88.3)
v1.max is 88.3
v1.min is 19.2
