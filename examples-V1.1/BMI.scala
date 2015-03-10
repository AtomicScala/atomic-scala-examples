// BMI.scala

val kg = 72.57 // 160 lbs
val heightM = 1.727 // 68 inches

val bmi = kg/(heightM * heightM)
if(bmi < 18.5) println("Underweight")
else if(bmi < 25) println("Normal weight")
else println("Overweight")
