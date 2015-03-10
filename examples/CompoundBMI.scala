// CompoundBMI.scala
val lbs = 150.0
val height = 68.0
val weightStatus = {
  val bmi = lbs/(height * height) * 703.07
  if(bmi < 18.5) "Underweight"
  else if(bmi < 25) "Normal weight"
  else "Overweight"
}
println(weightStatus)
