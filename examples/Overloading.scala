// Overloading.scala
import com.atomicscala.AtomicTest._

class Overloading1 {
  def f():Int = { 88 }
  def f(n:Int):Int = { n + 2 }
}

class Overloading2 {
  def f():Int = { 99 }
  def f(n:Int):Int = { n + 3 }
}

val mo1 = new Overloading1
val mo2 = new Overloading2
mo1.f() is 88
mo1.f(11) is 13
mo2.f() is 99
mo2.f(11) is 14
