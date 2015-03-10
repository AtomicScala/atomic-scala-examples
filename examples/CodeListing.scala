// CodeListing.scala
package codelisting
import java.io.FileNotFoundException

class ExtensionException(name:String)
  extends Exception(
    s"$name doesn't end with '.scala'")

class CodeListing(val fileName:String)
extends collection.IndexedSeq[String] {
  if(!fileName.endsWith(".scala"))
    throw new ExtensionException(fileName)
  val vec = io.Source.fromFile(fileName)
    .getLines.toVector
  def apply(idx:Int) = vec(idx)
  def length = vec.length
}

object CodeListing {
  def apply(name:String) =
    try {
      new CodeListing(name)
    } catch {
      case _:FileNotFoundException =>
        Vector(s"File Not Found: $name")
      case _:NullPointerException =>
        Vector("Error: Null file name")
      case e:ExtensionException =>
        Vector(e.getMessage)
    }
}
