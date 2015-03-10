// CompoundExpressions2.scala

val activity = "swimming"
val hour = 10

val isOpen = {
  if(activity == "swimming" ||
     activity == "ice skating") {
    val opens = 9
    val closes = 20
    println("Operating hours: " +
      opens + " - " + closes)
    if(hour >= opens && hour <= closes) {
      true
    } else {
      false
    }
  } else {
    false
  }
}

println(isOpen)
/* Output:
Operating hours: 9 - 20
true
*/
