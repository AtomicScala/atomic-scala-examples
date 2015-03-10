// Solid.scala
import com.atomicscala.AtomicTest._
import com.atomicscala.Name

class Solid extends Name
val s = new Solid
s is "Solid"

class Solid2(val size:Int) extends Name {
  override def toString =
    s"${super.toString}($size)"
}
val s2 = new Solid2(47)
s2 is "Solid2(47)"
