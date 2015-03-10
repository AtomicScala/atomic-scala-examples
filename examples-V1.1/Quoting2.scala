// Quoting2.scala

package object Quoting2 {
  implicit class AnyName(val s:String)
  extends AnyVal {
    def singleQuote = s"'$s'"
    def doubleQuote = s""""$s""""
  }
}
