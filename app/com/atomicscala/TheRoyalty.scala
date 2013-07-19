// TheRoyalty.scala
package royals

class Royalty(name:String,
characteristic:String) {
  def title():String = {
    "Sir " + characteristic + "alot"
  }
  def fancyTitle():String = {
    "Sir " + name +
    " " + characteristic + "alot"
  }
}
