// ShowListingEither.scala
import codelistingtester._
import codelistingeither._

def listing(name:String) = {
  CodeListingEither(name) match {
    case Right(lines) => lines
    case Left(error) => Vector(error)
  }
}

new CodeListingTester(listing)
