// PigInt.scala
import util.Try

val result = Try("pig".toInt)

assert(
  result.toString.startsWith("Failure"))

assert((try {
  result.get
} catch {
  case _:Throwable => "Yep, an exception"
}) == "Yep, an exception")
