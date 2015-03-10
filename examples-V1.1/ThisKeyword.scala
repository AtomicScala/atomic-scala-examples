// ThisKeyword.scala
import com.atomicscala.AtomicTest._

class X(val n:Int) {
  def f = this.n * 10
}

val x1 = new X(1)
val x2 = new X(2)

x1.f is 10
x2.f is 20
