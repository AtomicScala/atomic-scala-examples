// IntegerMath.scala

val lbs = 160
val height = 68

val bmi = lbs / (height * height) * 703.07

if (bmi < 18.5) println("Underweight")
else if (bmi < 25) println("Normal weight")
else println("Overweight")
