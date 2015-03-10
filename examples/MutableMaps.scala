// MutableMaps.scala
import com.atomicscala.AtomicTest._
import collection.mutable.Map

val m = Map(5 -> "five", 6 -> "six")
m(5) is "five"
m(5) = "5ive"
m(5) is "5ive"
m += 4 -> "four"
m is
Map(5 -> "5ive", 4 -> "four", 6 -> "six")
// Can't reassign val m:
// m = m + (3->"three")
