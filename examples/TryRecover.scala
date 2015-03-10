// TryRecover.scala
import com.atomicscala.AtomicTest._
import util.Try
import errors._

def f(n:Int) = Try(toss(n)).recover {
  case e:Throwable => e.getMessage
}.get

def g(n:Int) = Try(toss(n)).recover {
  case Except1(why) => why
  case Except2(n) => n
  case Except3(msg, d) => s"$msg $d"
}.get

f(0) is "OK"
f(1) is "Reason"
f(2) is "11"
f(3) is "Wanted: 1.618"

g(0) is "OK"
g(1) is "Reason"
g(2) is "11"
g(3) is "Wanted: 1.618"
