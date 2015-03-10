// ObjCounter.scala
import com.atomicscala.AtomicTest._

class Count() {
  val id = Count.id()
  override def toString = s"Count$id"
}

object Count {
  var n = -1
  def id() = { n += 1; n }
}

Vector(new Count, new Count, new Count,
  new Count, new Count) is
"Vector(Count0, Count1, " +
"Count2, Count3, Count4)"
