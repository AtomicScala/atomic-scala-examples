// EvaluationOrder.scala

val sunny = true
val hoursSleep = 6
val exercise = false
val temp = 55

val happy1 = sunny && temp > 50 ||
  exercise && hoursSleep > 7
println(happy1) // true

val sameHappy1 = (sunny && temp > 50) ||
  (exercise && hoursSleep > 7)
println(sameHappy1) // true

val notSame =
  (sunny && temp > 50 || exercise) &&
  hoursSleep > 7
println(notSame) // false
