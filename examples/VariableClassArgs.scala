// VariableClassArgs.scala
import com.atomicscala.AtomicTest._

class Sum(args:Int*) {
  def result():Int = {
    var total = 0
    for(n <- args) {
      total += n
    }
    total
  }
}

new Sum(13, 27, 44).result() is 84
new Sum(1, 3, 5, 7, 9, 11).result() is 36
