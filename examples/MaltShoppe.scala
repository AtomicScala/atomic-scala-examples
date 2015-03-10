// MaltShoppe.scala
import com.atomicscala.AtomicTest._
import sodafountain._
import Quantity._
import Holder._
import Syrup._
import IceCream._
import Sprinkle._

case class
Scoops(holder:Holder, scoops:Scoop*)

val iceCreamCone = Scoops(
  WaffleCone,
  Scoop(Extra, MochaFudge),
  Scoop(Extra, ButterPecan),
  Scoop(Extra, IceCream.Chocolate))

iceCreamCone is "Scoops(WaffleCone," +
"WrappedArray(Scoop(Extra,MochaFudge), " +
"Scoop(Extra,ButterPecan), " +
"Scoop(Extra,Chocolate)))"

case class MadeToOrder(
  holder:Holder,
  scoops:Seq[Scoop],
  toppings:Seq[Topping])

val iceCreamDish = MadeToOrder(
  Bowl,
  Seq(
    Scoop(Regular, Strawberry),
    Scoop(Regular, ButterPecan)),
  Seq[Topping]())

iceCreamDish is "MadeToOrder(Bowl," +
"List(Scoop(Regular,Strawberry), " +
"Scoop(Regular,ButterPecan)),List())"

case class Sundae(
  sauce:Sauce,
  sprinkles:Sprinkles,
  whipped:WhippedCream,
  nuts:Nuts,
  scoops:Scoop*) {
  val holder:Holder = Bowl
}

val hotFudgeSundae = Sundae(
  Sauce(Regular, HotFudge),
  Sprinkles(Regular, Sprinkle.Chocolate),
  WhippedCream(Regular), Nuts(Regular),
  Scoop(Regular, Coffee),
  Scoop(Regular, RumRaisin))

hotFudgeSundae is "Sundae(" +
  "Sauce(Regular,HotFudge)," +
  "Sprinkles(Regular,Chocolate)," +
  "WhippedCream(Regular),Nuts(Regular)," +
  "WrappedArray(Scoop(Regular,Coffee), " +
  "Scoop(Regular,RumRaisin)))"
