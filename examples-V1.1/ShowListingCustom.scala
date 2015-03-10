// ShowListingCustom.scala
import codelistingcustom._
import codelistingtester._

def listing(name:String) =
  CodeListingCustom(name).recover{
    case e => Vector(e.toString)
  }.get

new CodeListingTester(listing)
