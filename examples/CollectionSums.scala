// CollectionSums.scala
import com.atomicscala.AtomicTest._

List(10, 20, 30, 40, 50).sum is 150
Vector(10, 20, 30, 40, 50).sum is 150
Seq(10, 20, 30, 40, 50).sum is 150
Set(10, 20, 30, 40, 50, 50, 50).sum is 150
(10 to 50 by 10).sum is 150
