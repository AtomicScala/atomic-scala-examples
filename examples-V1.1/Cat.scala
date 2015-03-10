// Cat.scala
class Cat {
  def meow():String = { "mew!" }
}

val cat = new Cat
val m1 = cat.meow()
assert("mew!" == m1,
  "Expected mew!, Got " + m1)
