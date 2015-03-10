// CodeListingCustom.scala
package codelistingcustom
import codelisting._
import java.io.FileNotFoundException
import util.Success
import com.atomicscala.reporterr.Fail

object CodeListingCustom {
  def apply(name:String) =
    try {
      Success(new CodeListing(name))
    } catch {
      case _:FileNotFoundException =>
        Fail(s"File Not Found: $name")
      case _:NullPointerException =>
        Fail("Error: Null file name")
      case e:ExtensionException =>
        Fail(e.getMessage)
    }
}
