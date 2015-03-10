// IntPercent.scala
import com.atomicscala.AtomicTest._
import util.Try

def intPercent(amount:Int, total:Int) =
  Try(amount * 100 / total).getOrElse(100)

intPercent(49, 100) is 49
intPercent(49, 1000) is 4
intPercent(49, 0) is 100
