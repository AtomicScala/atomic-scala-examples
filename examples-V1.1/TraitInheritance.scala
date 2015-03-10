// TraitInheritance.scala

trait Base {
  def f = "f"
}

trait Derived1 extends Base {
  def g = "17"
}

trait Derived2 extends Derived1 {
  def h = "1.11"
}

class Derived3 extends Derived2

val d = new Derived3

d.f
d.g
d.h
