// ExtensionMethodArguments.scala
import com.atomicscala.AtomicTest._

case class Book(title:String)

object BookExtension {
  implicit class Ops(book:Book) {
    def categorize(category:String) =
      s"$book, category: $category"
  }
}
import BookExtension._

Book("Dracula") categorize "Vampire" is
"Book(Dracula), category: Vampire"
