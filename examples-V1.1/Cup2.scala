// Cup2.scala
import com.atomicscala.AtomicTest._

class Cup2 {
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    percentFull // Return this value
  }
}

val cup = new Cup2
cup.add(50) is 50
cup.add(70) is 100
