// VisibleClassArgs.scala
import com.atomicscala.AtomicTest._

class ClassArg2(var a:Int)
class ClassArg3(val a:Int)

val ca2 = new ClassArg2(20)
val ca3 = new ClassArg3(21)

ca2.a is 20
ca3.a is 21
ca2.a = 24
ca2.a is 24
// Can't do this: ca3.a = 35
