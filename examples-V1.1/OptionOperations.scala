// OptionOperations.scala
import com.atomicscala.AtomicTest._

def p(s:Option[String])= s.foreach(println)

p(Some("Hi")) // Prints "Hi"
p(Option("Hi")) // Prints "Hi"
p(None) // Doesn't do anything!

def f(s:Option[String]) = s.map(_ * 2)

f(Some("Hi")) is Some("HiHi")
f(None) is None

Option(null) is None
