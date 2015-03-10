// ImmutableMaps.scala
import com.atomicscala.AtomicTest._

val m = Map(5->"five", 6->"six")
m(5) is "five"
// m(5) = "5ive" // Fails
m + (4->"four") // Doesn't change m
m is Map(5 -> "five", 6 -> "six")
val m2 = m + (4->"four")
m2 is
Map(5 -> "five", 6 -> "six", 4 -> "four")
