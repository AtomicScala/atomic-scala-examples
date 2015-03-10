// ColorBlendMap.scala
import com.atomicscala.AtomicTest._
import paintcolors.Color
import paintcolors.Color._

val blender = (
  for {
    a <- Color.values.toSeq
    b <- Color.values.toSeq
    c = colorblend.blend(a, b)
  } yield ((a, b), c)
).toMap

blender.foreach(println)

def blend(a:Color,b:Color) = blender((a,b))

blend(red, yellow) is orange
blend(red, red) is red
blend(yellow,blue) is green
blend(purple,orange) is blue
blend(purple,brown) is brown
