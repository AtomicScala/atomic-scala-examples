// EitherMap.scala
import com.atomicscala.AtomicTest._

val evens = Range(0,10) map {
  case x if x % 2 == 0 => Right(x)
  case x => Left(x)
}

evens is Vector(Right(0), Left(1),
  Right(2), Left(3), Right(4), Left(5),
  Right(6), Left(7), Right(8), Left(9))

evens map {
  case Right(x) => s"Even: $x"
  case Left(x) => s"Odd: $x"
} is "Vector(Even: 0, Odd: 1, Even: 2, " +
  "Odd: 3, Even: 4, Odd: 5, Even: 6, " +
  "Odd: 7, Even: 8, Odd: 9)"
