// References.scala
import com.atomicscala.AtomicTest._

class Z(var n:Int)
var z1 = new Z(13)
var z2 = z1
z2.n is 13
z1.n = 97
z2.n is 97
