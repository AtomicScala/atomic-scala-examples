// TrueOrFalse.scala
import com.atomicscala.AtomicTest._

def trueOrFalse(exp:Boolean):String = {
  if(exp) {
    return "It's true!" // Need 'return'
  }
  "It's false"
}

val b = 1
trueOrFalse(b < 3) is "It's true!"
trueOrFalse(b > 3) is "It's false"
