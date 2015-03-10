// Yielding2.scala
import com.atomicscala.AtomicTest._

def yielding2(v:Vector[Int]):Vector[Int]={
  for {
    n <- v
    if n < 10
    isOdd = (n % 2 != 0)
    if(isOdd)
  } yield n
}

val v = Vector(1,2,3,5,6,7,8,10,13,14,17)
yielding2(v) is Vector(1, 3, 5, 7)
