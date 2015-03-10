// SeqOperations.scala
import com.atomicscala.AtomicTest._

testSeq(Vector(1, 7, 22, 11, 17))
testSeq(List(1, 7, 22, 11, 17))

def testSeq(s:Seq[Int]) = {
  // Is there anything inside?
  s.isEmpty is false
  // How many elements inside?
  s.length is 5

  // Appending to the end:
  s :+ 99 is Seq(1, 7, 22, 11, 17, 99)
  // Inserting at the beginning:
  47 +: s is Seq(47, 1, 7, 22, 11, 17)

  // Get the first element:
  s.head is 1
  // Get the rest after the first:
  s.tail is Seq(7, 22, 11, 17)
  // Get the last element:
  s.last is 17
  // Get all elements after the 3rd:
  s.drop(3) is Seq(11, 17)
  // Get all elements except last 3:
  s.dropRight(3) is Seq(1, 7)
  // Get first 3 elements:
  s.take(3) is Seq(1, 7, 22)
  // Get final 3 elements:
  s.takeRight(3) is Seq(22, 11, 17)
  // Section from indices 2 up to 5:
  s.slice(2,5) is Seq(22, 11, 17)

  // Get value at location 3:
  s(3) is 11
  // See if it contains a value:
  s.contains(22) is true
  s.indexOf(22) is 2
  // Replace value at location 3:
  s.updated(3, 16) is
    Seq(1, 7, 22, 16, 17)
  // Remove location 3:
  s.patch(3, Nil, 1) is
    Seq(1, 7, 22, 17)

  // Append two sequences:
  val seq2 = s ++ Seq(99, 88)
  seq2 is Seq(1, 7, 22, 11, 17, 99, 88)
  // Find the unique values and sort them:
  s.distinct.sorted is
    Seq(1, 7, 11, 17, 22)
  // Reverse the order:
  s.reverse is
    Seq(17, 11, 22, 7, 1)
  // Find the common elements:
  s.intersect(seq2) is Seq(1,7,22,11,17)
  // Smallest and largest values:
  s.min is 1
  s.max is 22
  // Does it begin or end
  // with these sequences?
  s.startsWith(Seq(1,7)) is true
  s.endsWith(Seq(11,17)) is true
  // Total all the values:
  s.sum is 58
  // Multiply together all the values:
  s.product is 28798
  // "Set" forces unique values:
  s.toSet is Set(1, 17, 22, 7, 11)
}
