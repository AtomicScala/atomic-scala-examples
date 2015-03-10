// CodeVector.scala
package codevector
import util.Try
import java.io.FileNotFoundException

class CodeVector(val name:String)
extends collection.IndexedSeq[String] {
  val vec = name match {
    case null =>
      Vector("Error: Null file name")
    case name
      if(!name.endsWith(".scala")) =>
      Vector(
        s"$name doesn't end with '.scala'")
    case _ =>
      Try(io.Source.fromFile(name)
          .getLines.toVector).recover{
        case _:FileNotFoundException =>
          Vector(s"File Not Found: $name")
      }.get
  }
  def apply(idx:Int) = vec(idx)
  def length = vec.length
}
