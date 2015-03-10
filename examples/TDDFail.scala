// TDDFail.scala
import com.atomicscala.AtomicTest._

calculateBMI(160, 68) is "Normal weight"
calculateBMI(100, 68) is "Underweight"
calculateBMI(200, 68) is "Overweight"

def calculateBMI(lbs: Int,
  height: Int):String = { "Normal weight" }
