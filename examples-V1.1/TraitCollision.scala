// TraitCollision.scala
import com.atomicscala.AtomicTest._

trait A {
  def f = 1.1
  def g = "A.g"
  val n = 7
}

trait B {
  def f = 7.7
  def g = "B.g"
  val n = 17
}

object C extends A with B {
  override def f = 9.9
  override val n = 27
  override def g = super[A].g + super[B].g
}

C.f is 9.9
C.g is "A.gB.g"
C.n is 27
