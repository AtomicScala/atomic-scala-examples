// ForWithRanges.scala
import com.atomicscala.AtomicTest._

var result = ""
for(i <- Range(0, 10)) {
  result += i + " "
}
result is "0 1 2 3 4 5 6 7 8 9 "

result = ""
for(i <- Range(1, 21, 3)) {
  result += i + " "
}
result is "1 4 7 10 13 16 19 "
