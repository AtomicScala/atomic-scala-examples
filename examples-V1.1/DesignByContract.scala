// DesignByContract.scala
import com.atomicscala.AtomicTest._
import util.Try

class Contractual {
  def f(i:Int, d:Double) = {
    require(i > 5 && i < 100,
      "i must be within 5 and 100")
    val result = d * i
    assume(result < 1000,
      "result must be less than 1000")
    result
  }
}

def test(i:Int, d:Double) =
  Try(new Contractual().f(i, d)).recover{
    case e => e.toString
  }.get

test(10, 99) is 990.0
test(11, 99) is
"java.lang.AssertionError: " +
"assumption failed: " +
"result must be less than 1000"
test(0, 0) is
"java.lang.IllegalArgumentException: " +
"requirement failed: " +
"i must be within 5 and 100"
