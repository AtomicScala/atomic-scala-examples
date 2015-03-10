// DivZeroCustom.scala
import com.atomicscala.AtomicTest._
import util.Success
import com.atomicscala.reporterr.Fail

def f(i:Int) =
  if(i == 0)
    Fail("Divide by zero")
  else
    Success(24/i)

def test(n:Int) = f(n).recover{
    case e => s"Failed: $e"
  }.get

test(4) is 6
test(5) is 4
test(6) is 4
test(0) is "Failed: Divide by zero"
test(24) is 1
test(25) is 0
