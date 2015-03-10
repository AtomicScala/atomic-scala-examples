// MatchExpressions.scala
import com.atomicscala.AtomicTest._

def matchColor(color:String):String = {
  color match {
    case "red" => "RED"
    case "blue" => "BLUE"
    case "green" => "GREEN"
    case _ => "UNKNOWN COLOR: " + color
  }
}

matchColor("white") is
  "UNKNOWN COLOR: white"
matchColor("blue") is "BLUE"
