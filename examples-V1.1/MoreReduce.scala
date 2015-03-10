// MoreReduce.scala
import com.atomicscala.AtomicTest._

(1 to 100).reduce((sum, n) => sum + n) is
  5050
val v2 = Vector("D", "u", "c", "k")
v2.reduce((sum, n) => sum + n) is "Duck"
