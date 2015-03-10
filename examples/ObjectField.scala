// ObjectField.scala
import com.atomicscala.AtomicTest._

class X {
  def increment() =  { X.n += 1; X.n }
}

object X {
  var n:Int = 0 // Only one of these
}

var a = new X
var b = new X
a.increment() is 1
b.increment() is 2
a.increment() is 3
