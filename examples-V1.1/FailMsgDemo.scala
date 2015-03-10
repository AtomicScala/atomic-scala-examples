// FailMsgDemo.scala
import com.atomicscala.reporterr.FailMsg

try {
  throw new FailMsg("Caught in try block")
} catch {
  case e:FailMsg => println(e.msg)
}

throw new FailMsg("Uncaught")
println("Beyond uncaught")

/* Output:
Caught in try block
Uncaught
*/
