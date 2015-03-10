// OptionMap.scala
import com.atomicscala.AtomicTest._

val evens = Range(0,10).
  map(Option(_).filter(_ % 2 == 0))

evens is Vector(Some(0), None, Some(2),
  None, Some(4), None, Some(6),
  None, Some(8), None)

evens map {
  case Some(x) => s"Even: $x"
  case None => "Odd"
} is "Vector(Even: 0, Odd, Even: 2, " +
  "Odd, Even: 4, Odd, Even: 6, " +
  "Odd, Even: 8, Odd)"
