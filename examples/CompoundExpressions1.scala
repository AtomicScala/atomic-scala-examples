// CompoundExpressions1.scala

val hour = 6

val isOpen = {
  val opens = 9
  val closes = 20
  println("Operating hours: " +
    opens + " - " + closes)
  if(hour >= opens && hour <= closes) {
    true
  } else {
    false
  }
}
println(isOpen)

/* Output:
Operating hours: 9 - 20
false
*/
