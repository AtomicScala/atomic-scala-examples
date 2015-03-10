// Quoting.scala
import com.atomicscala.AtomicTest._

object Quoting {
  implicit class AnyName(s:String) {
    def singleQuote = s"'$s'"
    def doubleQuote = s""""$s""""
  }
}
import Quoting._

"Hi".singleQuote is "'Hi'"
"Hi".doubleQuote is "\"Hi\""
