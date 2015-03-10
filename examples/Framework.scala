// Framework.scala
import com.atomicscala.AtomicTest._

trait Framework {
  val part1:Int
  def part2:Double
  // Even without definitions:
  def templateMethod = part1 + part2
}

def operation(impl:Framework) =
  impl.templateMethod

class Implementation extends Framework {
  val part1 = 42
  val part2 = 2.71828
}

operation(new Implementation) is 44.71828
