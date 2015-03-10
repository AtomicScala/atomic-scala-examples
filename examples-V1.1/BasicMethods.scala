// BasicMethods.scala
import com.atomicscala.AtomicTest._

def cube(x:Int):Int = { x * x * x }
cube(3) is 27

def bang(s:String):String = { s + "!" }
bang("pop") is "pop!"
