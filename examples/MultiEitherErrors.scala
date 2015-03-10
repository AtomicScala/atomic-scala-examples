// MultiEitherErrors.scala
import com.atomicscala.AtomicTest._
import errors._

def tossEither(which:Int) = which match {
  case 1 => Left(Except1("Reason"))
  case 2 => Left(Except2(11))
  case 3 => Left(Except3("Wanted:", 1.618))
  case _ => Right("OK")
}

def test(n:Int) = tossEither(n) match {
  case Left(err) => err match {
    case Except1(why) => s"Except1 $why"
    case Except2(n) => s"Except2 $n"
    case Except3(msg, d) =>
      s"Except3 $msg $d"
  }
  case Right(x) => x
}

test(0) is "OK"
test(1) is "Except1 Reason"
test(2) is "Except2 11"
test(3) is "Except3 Wanted: 1.618"
