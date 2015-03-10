// Vectors.scala
import com.atomicscala.AtomicTest._

// A Vector holds other objects:
val v1 = Vector(1, 3, 5, 7, 11, 13)
v1 is Vector(1, 3, 5, 7, 11, 13)

v1(4) is 11 // "Indexing" into a Vector

// Take each element of the Vector:
var result = ""
for(i <- v1) {
  result += i + " "
}
result is "1 3 5 7 11 13 "

val v3 = Vector(1.1, 2.2, 3.3, 4.4)
// reverse is an operation on the Vector:
v3.reverse is Vector(4.4, 3.3, 2.2, 1.1)

var v4 = Vector("Twas", "Brillig", "And",
                "Slithy", "Toves")
v4 is Vector("Twas", "Brillig", "And",
        "Slithy", "Toves")
v4.sorted is Vector("And", "Brillig",
        "Slithy", "Toves", "Twas")
v4.head is "Twas"
v4.tail is Vector("Brillig", "And",
        "Slithy", "Toves")
