// Cup.scala
import com.atomicscala.AtomicTest._

class Cup {
  var percentFull = 0
}

val c1 = new Cup
c1.percentFull = 50
val c2 = new Cup
c2.percentFull = 100
c1.percentFull is 50
c2.percentFull is 100
