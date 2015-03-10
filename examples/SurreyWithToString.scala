// SurreyWithToString.scala
import com.atomicscala.AtomicTest._

class Surrey2(val adornment:String) {
  override def toString =
    s"Surrey with the $adornment"
}

val fancy2 = new Surrey2("fringe on top")
fancy2 is "Surrey with the fringe on top"
