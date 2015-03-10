// ShowListingTry.scala
import util.Try
import java.io.FileNotFoundException
import codelisting._
import codelistingtester._

def listing(name:String) =
  Try(new CodeListing(name)).recover{
    case _:FileNotFoundException =>
      Vector(s"File Not Found: $name")
    case _:NullPointerException =>
      Vector("Error: Null file name")
    case e:ExtensionException =>
      Vector(e.getMessage)
  }.get

new CodeListingTester(listing)
