// CustomErrors.scala
import com.atomicscala.AtomicTest._

sealed trait Result
case class Good(x:Int, y:String)
  extends Result
case class Bad(errMsg:String)
  extends Result

def tossCustom(which:Int) = which match {
  case 1 => Bad("No good: 1")
  case 2 => Bad("No good: 2")
  case 3 => Bad("No good: 3")
  case _ => Good(which, "OK")
}

def test(n:Int) = tossCustom(n) match {
  case Bad(errMsg) => errMsg
  case Good(x, y) => (x, y)
}

test(47) is (47, "OK")
test(1) is "No good: 1"
test(2) is "No good: 2"
test(3) is "No good: 3"
