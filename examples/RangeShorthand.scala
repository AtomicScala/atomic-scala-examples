// RangeShorthand.scala
import com.atomicscala.AtomicTest._

var result = ""
for(i <- 0 until 10) {
  result += i + " "
}
result is "0 1 2 3 4 5 6 7 8 9 "

result = ""
for(i <- 0 to 10) {
  result += i + " "
}
result is "0 1 2 3 4 5 6 7 8 9 10 "

result = ""
for(i <- 'a' to 'h') {
  result += i + " "
}
result is "a b c d e f g h "
