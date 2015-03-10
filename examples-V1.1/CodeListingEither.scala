// CodeListingEither.scala
package codelistingeither
import codelisting._
import java.io.FileNotFoundException

object CodeListingEither {
  def apply(name:String) =
    try {
      Right(new CodeListing(name))
    } catch {
      case _:FileNotFoundException =>
        Left(s"File Not Found: $name")
      case _:NullPointerException =>
        Left("Error: Null file name")
      case e:ExtensionException =>
        Left(e.getMessage)
    }
}
