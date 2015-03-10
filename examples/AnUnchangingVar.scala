// AnUnchangingVar.scala
import com.atomicscala.AtomicTest._

class Y(val n:Int)
var y = new Y(11)
y.n is 11
// y.n = 22 // Not allowed
y = new Y(22)
