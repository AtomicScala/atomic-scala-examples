// MultipleClassArgs.scala
import com.atomicscala.AtomicTest._

class Sum3(a1:Int, a2:Int, a3:Int) {
  def result():Int = { a1 + a2 + a3 }
}

new Sum3(13, 27, 44).result() is 84
