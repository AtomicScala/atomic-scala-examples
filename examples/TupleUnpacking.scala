// TupleUnpacking.scala
import com.atomicscala.AtomicTest._

def f = (1,3.14,"Mouse",false,"Altitude")

val (n, d, a, b, h) = f

(a, b, n, d, h) is
  ("Mouse", false, 1, 3.14, "Altitude")

// Tuple indexing:
val all = f
f._1 is 1
f._2 is 3.14
f._3 is "Mouse"
f._4 is false
f._5 is "Altitude"
