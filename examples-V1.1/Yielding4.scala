// Yielding4.scala
import com.atomicscala.AtomicTest._

def yielding4(v:Vector[Int]) = {
  for {
    n <- v
    if n < 10
    isOdd = (n % 2 != 0)
    if(isOdd)
  } yield {
    for(u <- Range(0, n))
      yield u
  }
}

val v = Vector(1,2,3,5,6,7,8,10,13,14,17)
yielding4(v) is Vector(
  Vector(0),
  Vector(0, 1, 2),
  Vector(0, 1, 2, 3, 4),
  Vector(0, 1, 2, 3, 4, 5, 6)
)
