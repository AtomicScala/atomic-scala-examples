// ExpressionInterpolation.scala
import com.atomicscala.AtomicTest._

def f(n:Int):Int = { n * 11 }

s"f(7) is ${f(7)}!" is "f(7) is 77!"
