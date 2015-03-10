// ReturnBlob.scala
import com.atomicscala.AtomicTest._

case class
  ReturnBlob(data:Double, info:String)

def data(input:Double) =
  if(input > 5.0)
    ReturnBlob(input * 2, "High")
  else
    ReturnBlob(input * 2, "Low")

data(7.0) is ReturnBlob(14.0, "High")
data(4.0) is ReturnBlob(8.0, "Low")
