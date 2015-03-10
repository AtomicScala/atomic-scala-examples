// DivZeroEither.scala
import com.atomicscala.AtomicTest._

def f(i:Int) =
  if(i == 0)
    Left("Divide by zero")
  else
    Right(24/i)

def test(n:Int) =
  f(n) match {
    case Left(why) => s"Failed: $why"
    case Right(result) => result
  }

test(4) is 6
test(5) is 4
test(6) is 4
test(0) is "Failed: Divide by zero"
test(24) is 1
test(25) is 0
