// PythagoreanTheorem.scala
package pythagorean

class RightTriangle {
  def hypotenuse(a:Double, b:Double):Double={
    Math.sqrt(a*a + b*b)
  }
  def area(a:Double, b:Double):Double = {
    a*b/2
  }
}
