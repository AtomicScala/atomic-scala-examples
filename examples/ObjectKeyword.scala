// ObjectKeyword.scala
import com.atomicscala.AtomicTest._

object X {
  val n = 2
  def f = n * 10
  def g = this.n * 20
}

X.n is 2
X.f is 20
X.g is 40
