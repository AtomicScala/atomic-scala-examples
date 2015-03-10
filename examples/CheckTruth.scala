// CheckTruth.scala
import com.atomicscala.AtomicTest._

def checkTruth(
  exp1:Boolean, exp2:Boolean):String = {
  if(exp1 && exp2) {
    "Both are true"
  }
  else if(!exp1 && !exp2) {
    "Both are false"
  }
  else if(exp1) {
    "First: true, second: false"
  }
  else {
    "First: false, second: true"
  }
}

checkTruth(true || false, true) is
  "Both are true"
checkTruth(1 > 0 && -1 < 0, 1 == 2) is
  "First: true, second: false"
checkTruth(1 >= 2, 1 >= 1) is
  "First: false, second: true"
checkTruth(true && false,false && true) is
"Both are false"
