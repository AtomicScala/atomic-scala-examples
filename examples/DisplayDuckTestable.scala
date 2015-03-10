// DisplayDuckTestable.scala
import com.atomicscala.AtomicTest._

var s = ""
val duck = "Duck".toVector
duck.foreach(n => s = s + n + ":")
s is "D:u:c:k:"
