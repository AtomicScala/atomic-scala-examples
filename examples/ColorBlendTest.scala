// ColorBlendTest.scala
import com.atomicscala.AtomicTest._
import paintcolors.Color._
import colorblend.blend

blend(red, yellow) is orange
blend(red, red) is red
blend(yellow,blue) is green
blend(purple,orange) is blue
blend(purple,brown) is brown
