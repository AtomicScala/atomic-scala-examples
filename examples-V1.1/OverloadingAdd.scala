// OverloadingAdd.scala
import com.atomicscala.AtomicTest._

def addInt(i:Int, j:Int):Int = { i + j }
def addDouble(i:Double, j:Double):Double ={
  i + j
}

def add(i:Int, j:Int):Int = { i + j }
def add(i:Double, j:Double):Double = {
  i + j
}

addInt(5, 6) is add(5, 6)

addDouble(56.23, 44.77) is
  add(56.23, 44.77)
