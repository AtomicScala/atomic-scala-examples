// ChangingAVal.scala
import com.atomicscala.AtomicTest._

class X(var n:Int)
val x = new X(11)
x.n is 11
x.n = 22
x.n is 22
// x = new X(22) // Not allowed
