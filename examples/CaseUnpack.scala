// CaseUnpack.scala
import com.atomicscala.AtomicTest._

case class Employee(name:String, ID:Int)
val empA = Employee("Bob", 1130)
val Employee(nm, id) = empA
nm is "Bob"
id is 1130
