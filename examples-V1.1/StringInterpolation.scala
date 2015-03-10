// StringInterpolation.scala
import com.atomicscala.AtomicTest._

def i(s:String, n:Int, d:Double):String = {
  s"first: $s, second: $n, third: $d"
}

i("hi", 11, 3.14) is
"first: hi, second: 11, third: 3.14"
