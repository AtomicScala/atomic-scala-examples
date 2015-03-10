// OneOrTheOther.scala
import com.atomicscala.AtomicTest._

def oneOrTheOther(exp:Boolean):String = {
  if(exp) {
    "True!" // No 'return' necessary
  }
  else {
    "It's false"
  }
}

val v = Vector(1)
val v2 = Vector(3, 4)
oneOrTheOther(v == v.reverse) is "True!"
oneOrTheOther(v2 == v2.reverse) is
"It's false"
