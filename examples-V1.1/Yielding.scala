// Yielding.scala
import com.atomicscala.AtomicTest._

def yielding(v:Vector[Int]):Vector[Int]={
  val result = for {
    n <- v
    if n < 10
    if n % 2 != 0
  } yield n
  result
}

val v = Vector(1,2,3,5,6,7,8,10,13,14,17)
yielding(v) is Vector(1, 3, 5, 7)
