// Level.scala
import com.atomicscala.AtomicTest._

object Level extends Enumeration {
  type Level = Value
  val Overflow, High, Medium,
      Low, Empty = Value
}

Level.Medium is "Medium"
import Level._
Medium is "Medium"

{ for(n <- Range(0, Level.maxId))
    yield (n, Level(n)) } is
  Vector((0, Overflow), (1, High),
    (2, Medium), (3, Low), (4, Empty))

{ for(lev <- Level.values)
    yield lev }.toIndexedSeq is
  Vector(Overflow, High,
    Medium, Low, Empty)

def checkLevel(level:Level)= level match {
  case Overflow => ">>> Overflow!"
  case Empty => "Alert: Empty"
  case other =>  s"Level $level OK"
}

checkLevel(Low) is "Level Low OK"
checkLevel(Empty) is "Alert: Empty"
checkLevel(Overflow) is ">>> Overflow!"
