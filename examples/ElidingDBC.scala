// ElidingDBC.scala
import util.Try

object ElidingDBC extends App {
  println(Try(require(false, "require!")))
  println(Try(assume(false, "assume!")))
  println(Try(assert(false, "assert!")))
}
