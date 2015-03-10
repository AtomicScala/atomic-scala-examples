// Tuples.scala
import com.atomicscala.AtomicTest._

def data2(input:Double):(Double, String) =
  if(input > 5.0)
    (input * 2, "High")
  else
    (input * 2, "Low")

data2(7.0) is (14.0, "High")
data2(4.0) is (8.0, "Low")

def data3(input:Double) =
  if(input > 5.0)
    (input * 2, "High", true)
  else
    (input * 2, "Low", false)

data3(7.0) is (14.0, "High", true)
data3(4.0) is (8.0, "Low", false)
