// ObjectMethods.scala
import com.atomicscala.AtomicTest._

class X

object X {
  var n:Int = 0
  def increment() =  { n += 1; n }
  def count() = increment()
}

X.increment() is 1
X.increment() is 2
X.count() is 3
