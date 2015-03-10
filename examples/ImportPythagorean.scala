// ImportPythagorean.scala
import pythagorean.RightTriangle

val rt = new RightTriangle
println(rt.hypotenuse(3,4))
println(rt.area(3,4))
assert(rt.hypotenuse(3,4) == 5)
assert(rt.area(3,4) == 6)
