// RecursiveSum.scala
import com.atomicscala.AtomicTest._

def sumIt(toSum:List[Int], sum:Int=0):Int =
  if(toSum.isEmpty)
    sum
  else
    sumIt(toSum.tail, sum + toSum.head)

sumIt(List(10, 20, 30, 40, 50)) is 150
