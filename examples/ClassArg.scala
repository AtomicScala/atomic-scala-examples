// ClassArg.scala
import com.atomicscala.AtomicTest._

class ClassArg(a:Int) {
  println(f)
  def f():Int = { a * 10 }
}

val ca = new ClassArg(19)
ca.f() is 190
// ca.a // error
