// TryComprehension.scala
import com.atomicscala.AtomicTest._
import util.{Try, Failure, Success}

def cutoff(in:Int, thresh:Int, add:Int) =
  if(in < thresh)
    Failure(new Exception(
      s"$in below threshhold $thresh"))
  else
    Success(in + add)

def a(in:Int) = cutoff(in, 7, 1)
def b(in:Int) = cutoff(in, 8, 2)
def c(in:Int) = cutoff(in, 9, 3)

def f(in:Int) =
  for {
    u <- Try(in)
    v <- a(u)
    w <- b(v)
    x <- c(w)
    y = x + 10
  } yield y * 2 + 1

f(7) is Success(47)
f(6) is "Failure(java.lang.Exception: " +
  "6 below threshhold 7)"

val result =
  for {
    i <- 1 to 10
    j <- f(i).toOption
  } yield j

result is Vector(47, 49, 51, 53)
