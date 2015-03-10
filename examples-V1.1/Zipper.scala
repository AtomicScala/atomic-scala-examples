// Zipper.scala
import com.atomicscala.AtomicTest._

val left = Vector("a", "b", "c", "d")
val right = Vector("q", "r", "s", "t")

left.zip(right) is
"Vector((a,q), (b,r), (c,s), (d,t))"

left.zip(0 to 4) is
"Vector((a,0), (b,1), (c,2), (d,3))"

left.zipWithIndex is
"Vector((a,0), (b,1), (c,2), (d,3))"
