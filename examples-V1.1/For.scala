// For.scala
import com.atomicscala.AtomicTest._

var result = ""
for(i <- 0 to 9) {
  result += i + " "
}
result is "0 1 2 3 4 5 6 7 8 9 "

result = ""
for(i <- 0 until 10) {
  result += i + " "
}
result is "0 1 2 3 4 5 6 7 8 9 "

result = ""
for(i <- Range(0, 10)) {
  result += i + " "
}
result is "0 1 2 3 4 5 6 7 8 9 "

result = ""
for(i <- Range(0, 20, 2)) {
  result += i + " "
}
result is "0 2 4 6 8 10 12 14 16 18 "

var sum = 0
for(i <- Range(0, 20, 2)) {
  println("adding " + i + " to " + sum)
  sum += i
}
sum is 90
