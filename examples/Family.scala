// Family.scala

class Family(mom:String, dad:String,
  kids:String*)

new Family(mom="Mom", dad="Dad")
// Doesn't work:
// new Family(dad="Dad", mom="Mom")

new Family(mom="Mom", dad="Dad",
  kids="Sammy", "Bobby")
// Doesn't work:
/* new Family(dad="Dad", mom="Mom",
  kids="Sammy", "Bobby") */
