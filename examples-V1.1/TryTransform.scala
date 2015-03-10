// TryTransform.scala
import com.atomicscala.AtomicTest._
import util.Try
import errors._

def f(n:Int) = Try(toss(n)).transform(
  i => Try(s"$i Bob"), // Success
  e => e match { // Failure
    case Except1(why) => Try(why)
    case Except2(n) => Try(n)
    case Except3(msg, d) => Try(d)
  }
).get

f(0) is "OK Bob"
f(1) is "Reason"
f(2) is "11"
f(3) is "1.618"
