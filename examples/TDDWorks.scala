// TDDWorks.scala
import com.atomicscala.AtomicTest._

calculateBMI(160, 68) is "Normal weight"
calculateBMI(100, 68) is "Underweight"
calculateBMI(200, 68) is "Overweight"

def calculateBMI(lbs:Double,
  height:Double):String = {
  val bmi = lbs / (height*height) * 703.07
  if (bmi < 18.5) "Underweight"
  else if (bmi < 25) "Normal weight"
  else "Overweight"
}
