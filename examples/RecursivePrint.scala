// RecursivePrint.scala
def rPrint(s:Seq[Char]) {
  print(s.head)
  if(s.tail.nonEmpty)
    rPrint(s.tail) // Recursive call
}

rPrint("Recursion")
println
