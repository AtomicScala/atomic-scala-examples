// SimpleMap.scala
import com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 4)
v.map(n => n + 1) is Vector(2, 3, 4, 5)
