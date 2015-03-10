// UsingFail.scala
import com.atomicscala.AtomicTest._
import util.{Try, Success}
import com.atomicscala.reporterr.Fail

def f(i:Int) =
  if(i < 0)
    Fail(s"Negative value: $i")
  else if(i > 10)
    Fail(s"Value too large: $i")
  else
    Success(i)

f(-1) is "Failure(Negative value: -1)"
f(7) is "Success(7)"
f(11) is "Failure(Value too large: 11)"

def calc(a:Int, b:String, c:Int) =
  for {
    x <- f(a)
    y <- Try(b.toInt)
    sum  = x + y
    z <- f(c)
  } yield sum * z

calc(10, "11", 7) is "Success(147)"
calc(15, "11", 7) is
"Failure(Value too large: 15)"
calc(10, "dog", 7) is
"Failure(java.lang." +
"NumberFormatException: " +
"""For input string: "dog")"""
calc(10, "11", -1) is
"Failure(Negative value: -1)"
