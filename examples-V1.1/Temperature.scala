// Temperature.scala
import com.atomicscala.AtomicTest._

class Temperature {
  var current = 0.0
  var scale = "f"
  def setFahrenheit(now:Double):Unit = {
    current = now
    scale = "f"
  }
  def setCelsius(now:Double):Unit = {
    current = now
    scale = "c"
  }
  def getFahrenheit():Double = {
    if(scale == "f")
      current
    else
      current * 9.0/5.0 + 32.0
  }
  def getCelsius():Double = {
    if(scale == "c")
      current
    else
      (current - 32.0) * 5.0/9.0
  }
}

val temp = new Temperature
temp.setFahrenheit(98.6)
temp.getFahrenheit() is 98.6
temp.getCelsius is 37.0
temp.setCelsius(100.0)
temp.getFahrenheit is 212.0
