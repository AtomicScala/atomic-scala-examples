// Yielding3.scala
import com.atomicscala.AtomicTest._

def yielding3(v:Vector[Int]):Vector[Int]={
  for {
    n <- v
    if n < 10
    isOdd = (n % 2 != 0)
    if(isOdd)
  } yield {
    val u = n * 10
    u + 2
  }
}

val v = Vector(1,2,3,5,6,7,8,10,13,14,17)
yielding3(v) is Vector(12, 32, 52, 72)
